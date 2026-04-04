package com.visionary.jetpackcompose.canvas.screen

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun DrawLineScreen() {
    Canvas(modifier = Modifier.fillMaxSize()) {
        val canvasWidth=size.width
        val canvasHeight=size.height
        drawLine(
            color = Color.Red,
            start = Offset(x=0f,y=canvasHeight/2) ,
            end = Offset(x=canvasWidth,y=canvasHeight/2),
            strokeWidth = 10f
        )
    }
}