package com.visionary.jetpackcompose.canvas.screen

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun DrawRectangle() {
    Canvas(modifier = Modifier.fillMaxSize())
    {
        val canvasWidth=size.width
        val canvasHeight=size.height

        drawRect(
            color = Color.Red,
            size = Size(width = canvasWidth, height = canvasHeight/4),
            topLeft = Offset(0f,canvasHeight/3),
            style = Stroke(
                width = 10f,
                pathEffect = PathEffect.dashPathEffect(
                    floatArrayOf(20f,10f),0f
                )
            )
        )
    }
}