package com.visionary.jetpackcompose.jetpackcomposeneetroots

import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TextExample() {
//    Text(
//        text = "Hello World",
//        color = Color.Blue,
//        fontSize = 30.sp,
//        fontWeight = FontWeight.Bold,
//        fontFamily = FontFamily.Serif,
//        letterSpacing = 2.sp,
//        textAlign = TextAlign.Center
//
//    )
    var name by remember { mutableStateOf("") }
//    TextField(
//        value = name,
//        onValueChange = {name=it},
//        label = {
//            Text("Enter your name")
//        },
//        singleLine = true,
//        shape = CircleShape,
//        colors = TextFieldDefaults.colors(
//
//        )
//    )
    OutlinedTextField(
        value = name,
        onValueChange = {name=it},
        singleLine = true,
        label = {Text("Enter your name")},
        colors = OutlinedTextFieldDefaults.colors(
            unfocusedBorderColor = Color.Blue

        )
    )

}