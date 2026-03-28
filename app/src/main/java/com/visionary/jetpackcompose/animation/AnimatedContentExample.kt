package com.visionary.jetpackcompose.animation

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.ContentTransform
import androidx.compose.animation.scaleIn
import androidx.compose.animation.scaleOut
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AnimatedContentExample() {
    var count by remember { mutableIntStateOf(0) }
    Scaffold(
        floatingActionButton = {
            Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
                FloatingActionButton(onClick = { count++}) {
                    Icon(imageVector = Icons.Default.KeyboardArrowUp, contentDescription = null)
                }
                FloatingActionButton(onClick = { count--}) {
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
            AnimatedContent(targetState = count, transitionSpec = { ContentTransform(
                targetContentEnter = scaleIn(),
                initialContentExit = scaleOut()
            ) }) {
                Text(
                    text = it.toString(),
                    fontSize = 30.sp
                )
            }
        }
    }
}