package com.visionary.jetpackcompose.jetpackcompose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LayoutExample() {
//    Row (
//        modifier = Modifier.fillMaxSize(),
//        horizontalArrangement = Arrangement.SpaceBetween,
//        verticalAlignment = Alignment.CenterVertically
//        ){
//        Text("Banana", fontSize = 30.sp)
//        Text("Apple", fontSize = 30.sp)
//        Text("Mango", fontSize = 30.sp)
//    }
    Column (modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally){
        Text("Banana", fontSize = 30.sp)
       Text("Apple", fontSize = 30.sp)
       Text("Mango", fontSize = 30.sp)
    }
}