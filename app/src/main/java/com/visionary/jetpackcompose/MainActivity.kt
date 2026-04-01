package com.visionary.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.visionary.jetpackcompose.animation.AnimatableExample
import com.visionary.jetpackcompose.animation.AnimateAsStateExample
import com.visionary.jetpackcompose.animation.AnimateExample
import com.visionary.jetpackcompose.animation.AnimatedContentExample
import com.visionary.jetpackcompose.animation.InfiniteTransition
import com.visionary.jetpackcompose.jetpackcomposeneetroots.AlertDialogExample
import com.visionary.jetpackcompose.ui.theme.JetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        println("onCreate() called")
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackComposeTheme {
                AlertDialogExample()
            }
        }
    }

    override fun onStart() {
        super.onStart()
        println("onStart() called")
    }

    override fun onResume() {
        super.onResume()
        println("onResume() called")
    }

    override fun onPause() {
        super.onPause()
        println("onPause() called")
    }

    override fun onStop() {
        super.onStop()
        println("onStop() called")
    }

    override fun onRestart() {
        super.onRestart()
        println("onRestart() called")

    }

    override fun onDestroy() {
        super.onDestroy()
        println("onDestroy() called")
    }
}

