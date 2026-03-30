package com.visionary.jetpackcompose.animation

import android.util.Log
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.animate
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch

@Preview
@Composable
fun AnimateExample() {
    val size = remember { mutableFloatStateOf(1f) }
    val scope = rememberCoroutineScope()
    Scaffold(
        floatingActionButton = {
            Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
                FloatingActionButton(onClick = {
                    scope.launch {
                        animate(size.floatValue,size.floatValue+1) { new,_->
                            size.floatValue=new

                        }
                        Log.d("size",size.toString())

                    }
                }) {
                    Icon(imageVector = Icons.Default.KeyboardArrowUp, contentDescription = null)
                }
                FloatingActionButton(onClick = { scope.launch {
                    animate(size.floatValue, size.floatValue-1) { new, _ ->
                        size.floatValue=new
                    }} }) {
                    Icon(imageVector = Icons.Default.KeyboardArrowDown, contentDescription = null)
                }


            }
        }
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding), contentAlignment = Alignment.Center
        ) {
            Box(
                modifier = Modifier
                    .size(100.dp)
                    .scale(size.floatValue)
                    .background(Color.Red)
            )
        }
    }
}