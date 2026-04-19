package com.visionary.jetpackcompose.corotine

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun Coroutine() {
    var count by remember { mutableIntStateOf(0) }
    val scope= rememberCoroutineScope()
    Column(
        modifier = Modifier
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center)
    {
        fun calculateSum(): Long{
            var sum=0L
            for (i in 0..1000000000000){
                sum+=i

            }
            return sum
        }
        Text(
            text = count.toString(),
            fontSize = 24.sp
        )
        Button(onClick = {
            count++
        }) {
            Text("count")
        }
        Spacer(modifier = Modifier.height(50.dp))
        Text(
            text = calculateSum().toString(),
            fontSize = 24.sp
        )
        Button(onClick = {
            calculateSum()
        }) {
            Text("calculate sum")
        }

    }

}