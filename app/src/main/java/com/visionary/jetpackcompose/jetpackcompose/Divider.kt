package com.visionary.jetpackcompose.jetpackcompose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun HorizontalDividerExample() {
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        verticalArrangement =Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Anupam")
        HorizontalDivider(modifier = Modifier.padding(16.dp).width(60.dp))
        Text("Anupam")
    }
}
@Preview(showSystemUi = true)
@Composable
fun VerticalDividerExample() {
    Row(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Text("Anupam")
        VerticalDivider(modifier = Modifier.padding(16.dp).height(60.dp))
        Text("Anupam")
    }
}