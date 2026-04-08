package com.visionary.jetpackcompose.canvas.screen

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PointMode
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun DrawPoints() {
    Canvas(modifier = Modifier.fillMaxSize())
    {
        val canvasWidth=size.width
        val canvasHeight=size.height

        drawPoints(
            points = listOf(
                Offset(x=canvasWidth/2,80.dp.toPx()),
                Offset(x=canvasWidth/3,canvasHeight/3),
                Offset(x=canvasWidth/4,canvasHeight/4),
                Offset(x=canvasWidth/3,canvasHeight/6),
            ),
            pointMode = PointMode.Points,
            color = Color.Red,
            strokeWidth = 50f,
            cap = StrokeCap.Round
        )
    }
}