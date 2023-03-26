package com.alphaomardiallo.duwagol.common.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.alphaomardiallo.duwagol.common.data.model.prayerTimesCalendar.Data
import com.alphaomardiallo.duwagol.common.data.model.prayerTimesCalendar.toPrayer
import com.alphaomardiallo.duwagol.common.domain.usecase.methods.FetchMethodsUseCase
import com.alphaomardiallo.duwagol.common.domain.usecase.prayer.InsertPrayerUseCase
import com.alphaomardiallo.duwagol.common.domain.usecase.times.FetchTimesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import java.io.IOException
import javax.inject.Inject
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.HttpException
import timber.log.Timber

@HiltViewModel
class MainViewModel @Inject constructor(
    private val fetchMethodsUseCase: FetchMethodsUseCase,
    private val fetchTimesUseCase: FetchTimesUseCase,
    private val insertPrayerUseCase: InsertPrayerUseCase
) : ViewModel() {

    fun fetchMethods() {
        viewModelScope.launch(Dispatchers.IO) {
            try {

                val response = fetchMethodsUseCase.invoke()

                //TODO save response in DB and do not fetch again unless empty

            } catch (exception: IOException) {
                Timber.e("IOException", exception)
            } catch (exception: HttpException) {
                Timber.e("HttpException = ${exception.message}")
            }
        }
    }

    fun fetchTimes() {
        viewModelScope.launch() {
            try {

                val response = fetchTimesUseCase.invoke()

                if (!response.isSuccessful) {
                    Timber.w("No response from the API.")
                    return@launch
                }

                response.body()?.let { body ->
                    if (body.data.isEmpty()) {
                        Timber.e("API returns an empty prayer list")
                        return@let
                    }

                    insertPrayersInDB(body.data)
                }

                Timber.e("here")


            } catch (exception: IOException) {
                Timber.e("IOException", exception)
            } catch (exception: HttpException) {
                Timber.e("HttpException = ${exception.message}")
            }
        }
    }

    private fun insertPrayersInDB(list: List<Data>){
        viewModelScope.launch {
            list.map { data ->
                val prayer = data.toPrayer()
                insertPrayerUseCase.invoke(prayer)
            }
        }
    }
}