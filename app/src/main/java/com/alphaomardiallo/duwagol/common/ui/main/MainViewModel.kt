package com.alphaomardiallo.duwagol.common.ui.main

import android.content.ContentValues.TAG
import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.alphaomardiallo.duwagol.common.domain.usecase.methodsUseCase.FetchMethodsUseCase
import com.alphaomardiallo.duwagol.common.domain.usecase.timesUseCase.FetchTimesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.io.IOException
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val fetchMethodsUseCase: FetchMethodsUseCase,
    private val fetchTimesUseCase: FetchTimesUseCase,
) : ViewModel() {

    fun fetchMethods() {
        viewModelScope.launch(Dispatchers.IO) {
            try {

                val response = fetchMethodsUseCase.invoke()

                //TODO save response in DB and do not fetch again unless empty

            } catch (exception: IOException) {
                Log.e(TAG, "fetchMethods: IOException ${exception.message} ")
            }
        }
    }

    fun fetchTimes(){
        viewModelScope.launch(){
            try{

                val response = fetchTimesUseCase.invoke()

            } catch (exception: IOException){
                Log.e(TAG, "fetchTimes: IOException", exception)
            }
        }
    }
}