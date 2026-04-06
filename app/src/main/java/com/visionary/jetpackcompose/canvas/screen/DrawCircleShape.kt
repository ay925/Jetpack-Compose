package com.visionary.jetpackcompose.canvas.screen

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun DrawCircleShape() {
    Canvas(modifier = Modifier.fillMaxSize()) {
        val canvasHeight=size.height
        val canvasWidth=size.width
        drawCircle(
            color = Color.Red,
            radius =canvasWidth/4,
//            center = Offset(x=0f,y=canvasHeight/2),
            style = Stroke(
                width = 50f,
                pathEffect = PathEffect.dashPathEffect(
                    intervals =floatArrayOf(10f,20f), phase = 0f
                )
            )
        )
    }
}