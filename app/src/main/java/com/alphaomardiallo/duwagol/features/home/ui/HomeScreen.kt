package com.alphaomardiallo.duwagol.features.home.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.alphaomardiallo.duwagol.common.ui.theme.DuwagolTheme

@Composable
fun HomeScreen() {
    Surface(modifier = Modifier.fillMaxSize().padding(8.dp)) {
        Column {
            NextPrayerSection()
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
        Row{
            Timings()
            CircularProgressIndicator()
        }
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