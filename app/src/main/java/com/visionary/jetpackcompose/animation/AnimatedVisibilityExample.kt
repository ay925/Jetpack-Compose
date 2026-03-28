package com.visionary.jetpackcompose.animation

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.Crossfade
import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.animation.core.Ease
import androidx.compose.animation.core.EaseIn
import androidx.compose.animation.core.EaseInBack
import androidx.compose.animation.core.EaseInBounce
import androidx.compose.animation.core.EaseInCirc
import androidx.compose.animation.core.EaseInElastic
import androidx.compose.animation.core.EaseInExpo
import androidx.compose.animation.core.EaseInOutBack
import androidx.compose.animation.core.EaseInOutBounce
import androidx.compose.animation.core.EaseOut
import androidx.compose.animation.core.EaseOutBack
import androidx.compose.animation.core.EaseOutBounce
import androidx.compose.animation.core.EaseOutCirc
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.tween
import androidx.compose.animation.expandHorizontally
import androidx.compose.animation.expandVertically
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.scaleIn
import androidx.compose.animation.scaleOut
import androidx.compose.animation.shrinkHorizontally
import androidx.compose.animation.shrinkVertically
import androidx.compose.animation.slideIn
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.visionary.jetpackcompose.R
import kotlinx.coroutines.delay

@Preview(showSystemUi = true)
@Composable
fun AnimatedVisibilityExample() {
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
        )
        {
//            AnimatedVisibility(
//                visible = showBox,
////                enter = scaleIn(animationSpec = tween(durationMillis = 600, easing = EaseInOutBounce)),
////                exit = scaleOut(animationSpec = tween(durationMillis = 600,easing = Ease))
//                enter = scaleIn(
//                    animationSpec = spring(
//                        stiffness = Spring.StiffnessLow,
//                        dampingRatio = Spring.DampingRatioHighBouncy
//                    )
//                ),
//                exit = scaleOut(
//                    animationSpec = spring(
//                        stiffness = Spring.StiffnessLow,
//                        dampingRatio = Spring.DampingRatioNoBouncy
//                    )
//                )
//            ) {
//                Image(
//                    modifier = Modifier
//                        .height(200.dp)
//                        .width(200.dp)
//                        .clip(CircleShape),
//                    painter = painterResource(R.drawable.img),
//                    contentDescription = null,
//                    contentScale = ContentScale.Crop
//                )
//            AnimatedVisibility(
//                visible = showBox,
//                enter = scaleIn(),
//                exit = scaleOut(),
//
//            ) {
//                Column {
//                    Image(
//                        modifier = Modifier
//                            .height(200.dp)
//                            .width(200.dp)
//                            .clip(CircleShape),
////                            .animateEnterExit(enter = scaleIn(), exit = scaleOut()),
//                        painter = painterResource(R.drawable.img),
//                        contentDescription = null,
//                        contentScale = ContentScale.Crop
//                    )
//                    Image(
//                        modifier = Modifier
//                            .height(200.dp)
//                            .width(200.dp)
//                            .clip(CircleShape)
//                            .animateEnterExit(enter = fadeIn(animationSpec = tween(delayMillis = 2000)), exit = fadeOut(animationSpec = tween(durationMillis = 2000))),
//                        painter = painterResource(R.drawable.img),
//                        contentDescription = null,
//                        contentScale = ContentScale.Crop
//                    )
//                    Image(
//                        modifier = Modifier
//                            .height(200.dp)
//                            .width(200.dp)
//                            .clip(CircleShape),
////                            .animateEnterExit(enter = scaleIn(), exit = scaleOut()),
//                        painter = painterResource(R.drawable.img),
//                        contentDescription = null,
//                        contentScale = ContentScale.Crop
//                    )
//                    Image(
//                        modifier = Modifier
//                            .height(200.dp)
//                            .width(200.dp)
//                            .clip(CircleShape),
////                            .animateEnterExit(enter = scaleIn(), exit = scaleOut()),
//                        painter = painterResource(R.drawable.img),
//                        contentDescription = null,
//                        contentScale = ContentScale.Crop
//                    )
//
//                }
//            }
        }
    }
}