package com.alphaomardiallo.duwagol.features.home.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.alphaomardiallo.duwagol.R
import com.alphaomardiallo.duwagol.common.ui.theme.DuwagolTheme
import com.alphaomardiallo.duwagol.common.ui.theme.blackOverlay

@Composable
fun HomeScreen() {

    Surface(modifier = Modifier
        .fillMaxSize()
        .padding(8.dp)
    ) {
        Column(modifier = Modifier
            .verticalScroll(state = rememberScrollState())
            .padding(horizontal = 4.dp)
        ) {
            Spacer(modifier = Modifier.padding(8.dp))
            DateSection(date = "Vendredi 31 Mars", holidays = mutableListOf("Lail atul"))
            Spacer(modifier = Modifier.padding(8.dp))
            SunCycle()
            Spacer(modifier = Modifier.padding(8.dp))
            ListPrayers(prayers = list)
        }
    }
}

/////////////////////////////////////////////////////////////
/////// Top Section
/////////////////////////////////////////////////////////////

@Composable
private fun DateSection(date: String, holidays: List<String>) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(150.dp),
        shape = RoundedCornerShape(10.dp),
        elevation = CardDefaults.cardElevation(16.dp),
        colors = CardDefaults.cardColors(contentColor = MaterialTheme.colorScheme.onPrimary)
    ) {
        Box(modifier = Modifier.fillMaxSize()) {
            Image(painter = painterResource(id = R.drawable.background),
                contentDescription = "",
                contentScale = ContentScale.Crop)
            Column(modifier = Modifier
                .fillMaxSize()
                .background(blackOverlay),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center) {
                if (holidays.isNotEmpty()) {
                    Text(text = holidays[0],
                        style = MaterialTheme.typography.titleLarge,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold
                    )
                }
                Text(text = date,
                    style = MaterialTheme.typography.titleLarge,
                    color = Color.Black,
                    fontWeight = FontWeight.Bold
                )
            }
        }

    }
}

@Composable
private fun SunCycle() {
    Box(modifier = Modifier.fillMaxWidth()) {
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
            SunCard(sunrise = true, time = "04:33")
            SunCard(sunrise = false, time = "19:33")
        }
    }
}

@Composable
private fun SunCard(sunrise: Boolean, time: String) {
    Card(
        modifier = Modifier.size(170.dp)
    ) {
        Box(modifier = Modifier.fillMaxSize()) {
            val painter = if (sunrise) R.drawable.sunrise else R.drawable.sunset
            Image(
                painter = painterResource(id = painter),
                contentDescription = "",
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize(),
            )

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(blackOverlay),
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = if (sunrise) "SunRise" else "Sunset",
                    style = MaterialTheme.typography.titleLarge,
                    color = MaterialTheme.colorScheme.onPrimary)
                Text(text = time,
                    style = MaterialTheme.typography.titleLarge,
                    color = MaterialTheme.colorScheme.onPrimary)
            }
        }
    }
}

@Composable
private fun ListPrayers(prayers: List<UiPrayers>) {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        prayers.forEach {
            Timings(prayer = it.name, time = it.time)
            Spacer(modifier = Modifier.padding(4.dp))
        }
    }
}

@Composable
private fun Timings(prayer: String, time: String) {
    Card(modifier = Modifier.fillMaxWidth()) {
        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.Start) {
            Text(text = prayer,
                style = MaterialTheme.typography.titleMedium,
                color = MaterialTheme.colorScheme.primary)
            Text(text = time,
                style = MaterialTheme.typography.titleLarge,
                color = MaterialTheme.colorScheme.primary)
        }
    }
}

@Preview
@Composable
fun HomeScreenPreview() {
    DuwagolTheme {
        HomeScreen()
    }
}

data class UiPrayers(
    val name: String,
    val time: String,
)

val list = mutableListOf(
    UiPrayers("Fajr", "04:33"),
    UiPrayers("Dhuhur", "04:33"),
    UiPrayers("Asr", "04:33"),
    UiPrayers("Maghrib", "04:33"),
    UiPrayers("Isha", "04:33"),
)