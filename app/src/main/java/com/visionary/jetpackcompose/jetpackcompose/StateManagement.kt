package com.visionary.jetpackcompose.jetpackcompose

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ButtonElevation
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showSystemUi = true)
@Composable
fun StateManagementExample() {
    val context = LocalContext.current
//    var score by remember { mutableStateOf(0) }
    // remember savable saves the state during configuration
    var score by rememberSaveable { mutableIntStateOf(0) }
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.Cyan))
    {
        Text(
            text = "Counter Application",
            fontSize = 30.sp, modifier = Modifier
                .fillMaxWidth()
                .padding(top = 100.dp),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Serif,
            color = Color.Black
        )
        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                "Score : $score",
                fontSize = 30.sp,
                fontFamily = FontFamily.Cursive,
                fontWeight = FontWeight.SemiBold
            )
            Spacer(modifier = Modifier.height(100.dp))
            Row() {
                Button(
                    onClick = { score++ },
                    shape = CircleShape,
                    modifier = Modifier.size(100.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.White,
                        contentColor = Color.Black
                    ),
                    contentPadding = PaddingValues(0.dp),
                    elevation = ButtonDefaults
                        .buttonElevation(
                            defaultElevation = 20.dp,
                            pressedElevation = 40.dp
                        )
                ) {
                    Text("Increase")

                }
                Spacer(modifier = Modifier.width(16.dp))
                Button(
                    onClick = {
                        if (score > 0) score--
                        else Toast.makeText(
                            context,
                            "Value can not be more decrees",
                            Toast.LENGTH_SHORT
                        ).show()
                    },
                    shape = CircleShape,
                    modifier = Modifier.size(100.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.White,
                        contentColor = Color.Black
                    ),
                    contentPadding = PaddingValues(0.dp),
                    elevation = ButtonDefaults
                        .buttonElevation(
                            defaultElevation = 20.dp,
                            pressedElevation = 40.dp
                        )
                ) {
                    Text("Decrease")
                }
            }
            Button(
                onClick = { score = 0 },
                shape = CircleShape,
                modifier = Modifier.size(100.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White,
                    contentColor = Color.Black
                ),
                contentPadding = PaddingValues(0.dp),
                elevation = ButtonDefaults
                    .buttonElevation(
                        defaultElevation = 20.dp,
                        pressedElevation = 40.dp
                    )
            ) {
                Text("Reset")
            }

        }

    }
}
/*

@Composable
fun StateHostingParent(modifier: Modifier = Modifier) {
    var score by rememberSaveable { mutableIntStateOf(0) }
    val increment = { score++ }
    val decrement = { score-- }
    CounterChild(score, increment, decrement)
}

@Composable
fun CounterChild(score: Int, increment: () -> Int, decrement: () -> Int) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("Score :$score", fontSize = 30.sp)
        Spacer(modifier = Modifier.height(50.dp))
        Row() {
            Button(
                onClick = { increment() },
                modifier = Modifier.weight(1f)
            ) {
                Text("Increase")

            }
            Spacer(modifier = Modifier.width(16.dp))
            Button(
                onClick = {
                    if (score > 0) decrement()
                },
                modifier = Modifier.weight(1f),
                enabled = score > 0
            ) {
                Text("Decrease")
            }
        }

    }
}
 */