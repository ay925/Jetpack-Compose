package com.visionary.jetpackcompose.jetpackcomposeneetroots.intents

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.visionary.jetpackcompose.MainActivity
import com.visionary.jetpackcompose.ui.theme.JetpackComposeTheme

class SecondActivity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            JetpackComposeTheme {
                Column(modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center)
                {
                    Text("Second Activity")
                    Spacer(modifier = Modifier.height(20.dp))
                    Button(onClick = {
                        val intent= Intent(this@SecondActivity, MainActivity::class.java)
                        startActivity(intent)
                    }) {
                        Text("Go to main Activity")
                    }
                }
            }
        }
    }
}