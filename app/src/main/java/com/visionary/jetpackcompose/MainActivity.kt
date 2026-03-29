package com.visionary.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.visionary.jetpackcompose.animation.AnimatableExample
import com.visionary.jetpackcompose.animation.AnimatedContentExample
import com.visionary.jetpackcompose.ui.theme.JetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackComposeTheme {
                AnimatableExample()
            }
        }
    }
}

