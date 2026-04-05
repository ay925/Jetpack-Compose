package com.visionary.jetpackcompose.canvas.screen

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun DrawLineScreen() {
    Canvas(modifier = Modifier.fillMaxSize()) {
        val canvasWidth=size.width
        val canvasHeight=size.height
        drawLine(
            color = Color.Red,
            start = Offset(x=20f,y=canvasHeight/2) ,
            end = Offset(x=canvasWidth-20,y=canvasHeight/2),
            strokeWidth = 10f,
//            cap = StrokeCap.Round,
//            alpha = 0.8f,
            pathEffect = PathEffect.dashPathEffect(floatArrayOf(10f,30f), phase = 70f)
        )
    }
}
@Composable
fun DiagonalLineScreen() {
    Canvas(modifier = Modifier.fillMaxSize()) {
        val canvasWidth=size.width
        val canvasHeight=size.height
        drawLine(
            color = Color.Red,
            start = Offset(x=0f,y=0f),
            end = Offset(x=canvasWidth, y = canvasHeight),
            strokeWidth = 10f,
        )
    }
}

@Preview
@Composable
fun VerticalCenterLineScreen() {
    Canvas(modifier = Modifier.fillMaxSize()) {
        val canvasWidth=size.width
        val canvasHeight=size.height
        drawLine(
            color = Color.Red,
            start = Offset(x=canvasWidth/2f,y=0f),
            end = Offset(x=canvasWidth/2, y = canvasHeight),
            strokeWidth = 10f,
        )
    }
}

@Composable
fun CrossLineScreen() {
    Canvas(modifier = Modifier.fillMaxSize()) {
        val canvasWidth=size.width
        val canvasHeight=size.height
        drawLine(
            color = Color.Red,
            start = Offset(x=canvasWidth/2f,y=0f),
            end = Offset(x=canvasWidth/2, y = canvasHeight),
            strokeWidth = 10f,
        )
        drawLine(
            color = Color.Red,
            start = Offset(x=0f,y=canvasHeight/2f),
            end = Offset(x=canvasWidth, y = canvasHeight/2f),
            strokeWidth = 10f,
        )

    }
}

@Preview
@Composable
fun KotlinLogo() {
    Canvas(modifier = Modifier.fillMaxSize()) {
        val canvasWidth=size.width
        val canvasHeight=size.height
        drawLine(
            color = Color.Blue,
            start = Offset(x=canvasWidth/2-200, y = canvasHeight/2-250),
            end =Offset(x=canvasWidth/2-200,y=canvasHeight/2+250) ,
            strokeWidth = 10f,
        )
        drawLine(
            color = Color.Blue,
            start = Offset(x=canvasWidth/2-200, y = canvasHeight/2-250),
            end = Offset(x=canvasWidth/2+200,y=canvasHeight/2-250),
            strokeWidth = 10f,
        )
        drawLine(
            color = Color.Blue,
            start = Offset(x=canvasWidth/2+200, y = canvasHeight/2+250),
            end = Offset(x=canvasWidth/2-200,y=canvasHeight/2+250),
            strokeWidth = 10f,
        )
        drawLine(
            color = Color.Blue,
            start = Offset(x=canvasWidth/2+200, y = canvasHeight/2-250),
            end = Offset(x=canvasWidth/2-20,y=canvasHeight/2),
            strokeWidth = 10f,
        )
        drawLine(
            color = Color.Blue,
            start = Offset(x=canvasWidth/2-20, y = canvasHeight/2),
            end = Offset(x=canvasWidth/2+200,y=canvasHeight/2+250),
            strokeWidth = 10f,
        )

    }
}