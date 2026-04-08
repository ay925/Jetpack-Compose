package com.visionary.jetpackcompose.canvas.screen

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun DrawArc() {
    Canvas(modifier = Modifier.fillMaxSize())
    {
        val canvasWidth=size.width
        val canvasHeight=size.height

        drawArc(
            color = Color.Red,
            startAngle = 0f,
            sweepAngle = 180f,
            useCenter = true,
            topLeft = Offset(x=canvasWidth/3,canvasHeight/2),
            size = Size(200.dp.toPx(),200.dp.toPx()),
            style = Stroke(
                width = 20f
            )
        )
    }
}