package com.visionary.jetpackcompose.jetpackcomposeneetroots.splashscreen

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.window.SplashScreen
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.lifecycleScope
import com.visionary.jetpackcompose.MainActivity
import com.visionary.jetpackcompose.R
import com.visionary.jetpackcompose.jetpackcomposeneetroots.splashscreen.ui.theme.JetpackComposeTheme
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashScreenActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


//        Handler(Looper.getMainLooper()).postDelayed(
//            {
//                startActivity(Intent(this@SplashScreenActivity, MainActivity::class.java))
//                finish()
//            },
//            2000
//        )
        lifecycleScope.launch {
            delay(2000)
            startActivity(Intent(this@SplashScreenActivity, MainActivity::class.java))
            finish()
        }
        enableEdgeToEdge()
        setContent {
            JetpackComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Box(modifier = Modifier
                        .fillMaxSize()
                        .background(Color.Blue)
                        .padding(innerPadding),
                    )
                    {
                        Image(
                            painter = painterResource(R.drawable.img),
                            contentDescription = null,
                            modifier = Modifier
                                .align(Alignment.Center)
                                .size(200.dp)
                                .clip(CircleShape),
                            contentScale = ContentScale.Crop
                        )
                        Text(modifier = Modifier.align(Alignment.BottomCenter),
                            text = "A boy"
                        )

                    }
                }
            }
        }
    }
}
