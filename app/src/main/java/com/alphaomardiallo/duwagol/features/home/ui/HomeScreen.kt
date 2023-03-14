package com.alphaomardiallo.duwagol.features.home.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.alphaomardiallo.duwagol.R
import com.alphaomardiallo.duwagol.common.ui.theme.DuwagolTheme
import com.alphaomardiallo.duwagol.features.home.domain.PrayerUi

@Composable
fun HomeScreen() {
    Column {
        Surface(modifier = Modifier
            .fillMaxSize()
            .weight(1f)
        ) {
            NextPrayerSection()
        }
        Surface(modifier = Modifier
            .fillMaxSize()
            .weight(2f))
        {
            PrayerTimesSection()
        }
    }
}

/////////////////////////////////////////////////////////////
/////// Top Section
/////////////////////////////////////////////////////////////

@Composable
private fun NextPrayerSection() {
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceBetween) {
        Timings()
        CurrentLocation()
    }
}

@Composable
private fun Timings() {
    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(8.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start) {
        Text(text = "Fajr",
            style = MaterialTheme.typography.titleLarge,
            color = MaterialTheme.colorScheme.primary)
        Text(text = "04:23",
            style = MaterialTheme.typography.displaySmall,
            color = MaterialTheme.colorScheme.primary)
    }
}

@Composable
private fun CurrentLocation() {
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(8.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.End) {
        Text(text = "London, United Kingdom",
            style = MaterialTheme.typography.bodyLarge,
            color = MaterialTheme.colorScheme.primary)
        Spacer(modifier = Modifier.padding(8.dp))
        Icon(imageVector = Icons.Default.Refresh,
            contentDescription = "refresh",
            tint = MaterialTheme.colorScheme.primary)
    }
}

/////////////////////////////////////////////////////////////
/////// Bottom Section
/////////////////////////////////////////////////////////////

@Composable
private fun PrayerTimesSection() {
    Card(
        modifier = Modifier.fillMaxSize(),
        shape = RoundedCornerShape(topStart = 10.dp,
            topEnd = 10.dp,
            bottomEnd = 0.dp,
            bottomStart = 0.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.primary)
    ) {
        DateSection()
        PrayerSection()
    }
}

@Composable
private fun DateSection() {
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(8.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(painter = painterResource(id = R.drawable.ic_baseline_arrow_left_24),
            contentDescription = "arrow left")
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "Wednesday 15th January ", style = MaterialTheme.typography.titleMedium)
            Text(text = "Al Arba'a 22 Shaʿbān 1444", style = MaterialTheme.typography.titleSmall)
        }
        Icon(painter = painterResource(id = R.drawable.ic_baseline_arrow_right_24),
            contentDescription = "arrow right")
    }
    Divider()
}

@Composable
private fun PrayerSection() {
    val timings = listOf(
        PrayerUi(name = "Fajr", timing = "04:23"),
        PrayerUi(name = "Sunrise", timing = "06:15"),
        PrayerUi(name = "Dhuhr", timing = "12:09"),
        PrayerUi(name = "Asr", timing = "15:20"),
        PrayerUi(name = "Maghrib", timing = "18:04"),
        PrayerUi(name = "Isha", timing = "19:50"),
    )

    LazyVerticalGrid(columns = GridCells.Adaptive(128.dp),
        contentPadding = PaddingValues(horizontal = 12.dp, vertical = 16.dp)) {
        items(timings.size) { prayer ->
            Card(
                modifier = Modifier
                    .padding(8.dp)
                    .height(80.dp),
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 16.dp
                )
            ) {
                Column(Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                    verticalArrangement = Arrangement.SpaceEvenly,
                    horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(text = timings[prayer].name)
                    Text(text = timings[prayer].timing)
                }
            }
        }
    }
}

/////////////////////////////////////////////////////////////
/////// Preview Section
/////////////////////////////////////////////////////////////

@Preview
@Composable
fun HomeScreenPreview() {
    DuwagolTheme {
        HomeScreen()
    }
}