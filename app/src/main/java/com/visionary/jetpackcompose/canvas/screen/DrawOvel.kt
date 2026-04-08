package com.visionary.jetpackcompose.canvas.screen

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun DrawOvel() {
    Canvas(modifier = Modifier.fillMaxSize())
    {
        val canvasWidth=size.width
        val canvasHeight=size.height

        drawOval(
            color = Color.Red,
            size = Size(200f,400f),
            topLeft = Offset(canvasWidth/3,canvasHeight/2)

        )
    }
}