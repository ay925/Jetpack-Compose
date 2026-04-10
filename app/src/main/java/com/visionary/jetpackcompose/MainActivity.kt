package com.visionary.jetpackcompose

import android.content.Intent
import android.net.Uri
import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import coil3.compose.AsyncImage
import com.visionary.jetpackcompose.jetpackcomposeneetroots.intents.ImageViewModel
import com.visionary.jetpackcompose.jetpackcomposeneetroots.intents.SecondActivity
import com.visionary.jetpackcompose.jetpackcomposeneetroots.sharedpref.SharedPreferences
import com.visionary.jetpackcompose.ui.theme.JetpackComposeTheme

class MainActivity : ComponentActivity() {
    //    private val viewModel: ScoreViewModel by viewModels()
//    private val viewModel: ImageViewModel by viewModels()

//    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    installSplashScreen()
        enableEdgeToEdge()
        setContent {
            JetpackComposeTheme {

                SharedPreferences(this)
//                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
//                    Text(
//                        text = "Main Activity",
//                        fontSize = 24.sp,
//                    )
//                }
            }
        }
    }
}
//                Column(
//                    modifier = Modifier.fillMaxSize(),
//                    horizontalAlignment = Alignment.CenterHorizontally,
//                    verticalArrangement = Arrangement.Center
//                )
//                {
//                    AsyncImage(
//                        modifier = Modifier
//                            .size(200.dp)
//                            .clip(CircleShape),
//                        model = viewModel.uri,
//                        contentDescription = null,
//                        contentScale = ContentScale.Crop
//                    )
//                    Text("Main Activity")
//                    Spacer(modifier = Modifier.height(20.dp))
//                    Button(onClick = {
//                        val intent = Intent(this@MainActivity, SecondActivity::class.java)
//                        startActivity(intent)
//                    }) {
//                        Text("Go to second Activity")
//                    }
//
//                    Button(
//                        onClick = {
//                            val intent = Intent(Intent.ACTION_VIEW)
//                            intent.data = "https://github.com/ay925".toUri()
//                            startActivity(intent)
//                        }) {
//                        Text("Open github link")
//                    }
//
//                    Button(
//                        onClick = {
//                            val intent = Intent(Intent.ACTION_MAIN)
//                            intent.setPackage("com.google.android.youtube")
//                            try {
//                                startActivity(intent)
//                            } catch (e: Exception) {
//                                e.printStackTrace()
//                            }
//                        }) {
//                        Text("Open Youtube")
//                    }
//
//                    Button(
//                        onClick = {
//                            val intent = Intent(Intent.ACTION_SEND)
//                            intent.type = "text/plain"
//                            intent.putExtra(Intent.EXTRA_TEXT, "Hi I am a Anupam Yadav")
//                            startActivity(Intent.createChooser(intent, "Share via"))
//                        }) {
//                        Text("Send text")
//                    }
//                    Button(
//                        onClick = {
//                            val intent = Intent(Intent.ACTION_SEND)
//
//                            intent.type = "image/*"   // VERY IMPORTANT
//
//                            intent.putExtra(Intent.EXTRA_TEXT, "Hi I am Anupam Yadav")
//                            intent.putExtra(Intent.EXTRA_STREAM, viewModel.uri)
//
//                            intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
//
//                            startActivity(Intent.createChooser(intent, "Share via"))
//                        }) {
//                        Text("Send image with text")
//                    }
//                }
//            }
//
//        }
//        val uri = intent.getParcelableExtra(Intent.EXTRA_STREAM, Uri::class.java)
//        viewModel.updateUri(uri)
//    }

