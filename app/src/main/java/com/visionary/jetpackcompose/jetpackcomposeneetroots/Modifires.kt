package com.visionary.jetpackcompose.jetpackcomposeneetroots

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showSystemUi = true)
@Composable
fun ModifiersExample() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.LightGray),
                horizontalArrangement = Arrangement.SpaceEvenly,

                ) {
                Text(
                    "Apple",
                    fontSize = 30.sp
                )
                Text(
                    "Banana",
                    fontSize = 30.sp
                )
                Text(
                    "Grapes",
                    fontSize = 30.sp
                )
            }
            Box(
                modifier = Modifier
                    .background(Color.Red, shape = RoundedCornerShape(10.dp))
                    .size(150.dp)
                    .border(color = Color.Green, shape = RoundedCornerShape(10.dp), width = 5.dp),
                contentAlignment = Alignment.Center,
            ) {
                Text("Center", fontSize = 30.sp)
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Cyan),
                horizontalArrangement = Arrangement.SpaceEvenly,

                ) {
                Text(
                    "One",
                    fontSize = 30.sp
                )
                Text(
                    "Two",
                    fontSize = 30.sp
                )
                Text(
                    "Three",
                    fontSize = 30.sp
                )
            }
        }
    }
}