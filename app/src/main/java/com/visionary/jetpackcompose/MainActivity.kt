package com.visionary.jetpackcompose

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.visionary.jetpackcompose.jetpackcomposeneetroots.androidbasics.viewmodel.CounterApp
import com.visionary.jetpackcompose.jetpackcomposeneetroots.androidbasics.viewmodel.ScoreViewModel
import com.visionary.jetpackcompose.jetpackcomposeneetroots.intents.SecondActivity
import com.visionary.jetpackcompose.ui.theme.JetpackComposeTheme

class MainActivity : ComponentActivity() {
//    private val viewModel: ScoreViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackComposeTheme {
                Column(modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center)
                {
                    Text("Main Activity")
                    Spacer(modifier = Modifier.height(20.dp))
                    Button(onClick = {
                        val intent= Intent(this@MainActivity, SecondActivity::class.java)
                        startActivity(intent)
                    }) {
                        Text("Go to second Activity")
                    }

                    Button(
                        onClick = {
                            val intent= Intent(Intent.ACTION_VIEW)
                            intent.data= Uri.parse("https://github.com/ay925")
                            startActivity(intent)
                        }) {
                        Text("Open gihub link")
                    }

                    Button(
                        onClick = {
                            val intent= Intent(Intent.ACTION_MAIN)
                            intent.setPackage("com.google.android.youtube")
                            try {
                                startActivity(intent)
                            }catch (e: Exception){
                                e.printStackTrace()
                            }
                        }) {
                        Text("Open Youtube")
                    }

                    Button(
                        onClick = {
                            val intent= Intent(Intent.ACTION_SEND)
                            intent.type="text/plain"
                            intent.putExtra(Intent.EXTRA_TEXT,"Hi I am a Anupam Yadav")
                            startActivity(Intent.createChooser(intent,"Share via"))
                        }) {
                        Text("Send message")
                    }
                }
            }
        }
    }
}

