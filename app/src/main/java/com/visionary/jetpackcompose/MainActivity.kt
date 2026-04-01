package com.visionary.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.lifecycle.viewmodel.compose.viewModel
import com.visionary.jetpackcompose.animation.AnimatableExample
import com.visionary.jetpackcompose.animation.AnimateAsStateExample
import com.visionary.jetpackcompose.animation.AnimateExample
import com.visionary.jetpackcompose.animation.AnimatedContentExample
import com.visionary.jetpackcompose.animation.InfiniteTransition
import com.visionary.jetpackcompose.jetpackcomposeneetroots.AlertDialogExample
import com.visionary.jetpackcompose.jetpackcomposeneetroots.androidbasics.viewmodel.CounterApp
import com.visionary.jetpackcompose.jetpackcomposeneetroots.androidbasics.viewmodel.ScoreViewModel
import com.visionary.jetpackcompose.ui.theme.JetpackComposeTheme

class MainActivity : ComponentActivity() {
    private val viewModel: ScoreViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackComposeTheme {
                CounterApp(viewModel)
            }
        }
    }
}

