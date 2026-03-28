package com.visionary.jetpackcompose.animation

import androidx.compose.animation.Crossfade
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.visionary.jetpackcompose.R

@Composable
fun CrossfadeExample() {
    var showBox by remember { mutableStateOf(false) }
    Scaffold(
        floatingActionButton = {
            FloatingActionButton(onClick = { showBox = !showBox }) {
                Icon(imageVector = Icons.Default.Refresh, contentDescription = null)
            }
        }
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding), contentAlignment = Alignment.Center
        ) {
            Crossfade(targetState = showBox) {visible->
                if (visible) {
                    Image(
                        modifier = Modifier
                            .height(200.dp)
                            .width(200.dp)
                            .clip(CircleShape),
                        painter = painterResource(R.drawable.img),
                        contentDescription = null,
                        contentScale = ContentScale.Crop
                    )
                } else {Image(
                    modifier = Modifier
                        .height(200.dp)
                        .width(200.dp)
                        .clip(CircleShape),
                    painter = painterResource(R.drawable.img_1),
                    contentDescription = null,
                    contentScale = ContentScale.Crop
                )
                }
            }
        }
    }
}