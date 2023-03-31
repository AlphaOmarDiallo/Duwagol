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
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.alphaomardiallo.duwagol.R
import com.alphaomardiallo.duwagol.common.ui.theme.DuwagolTheme
import com.alphaomardiallo.duwagol.common.ui.theme.blackOverlay

@Composable
fun HomeScreen() {
    Surface(modifier = Modifier
        .fillMaxSize()
        .padding(8.dp)) {
        Column {
            SunCycle()
        }
    }
}

/////////////////////////////////////////////////////////////
/////// Top Section
/////////////////////////////////////////////////////////////

@Composable
private fun NextPrayerSection() {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(10.dp),
        elevation = CardDefaults.cardElevation(16.dp),
    ) {
        Row {
            Timings("Fajr", "05:33")
            CircularProgressIndicator()
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
        modifier = Modifier.size(150.dp)
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
                modifier = Modifier.fillMaxSize().background(blackOverlay),
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
private fun Timings(prayer: String, time: String) {
    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(8.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start) {
        Text(text = prayer,
            style = MaterialTheme.typography.titleLarge,
            color = MaterialTheme.colorScheme.primary)
        Text(text = time,
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