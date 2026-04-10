package com.visionary.jetpackcompose.jetpackcomposeneetroots.sharedpref

import android.content.Context
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.content.edit
import com.visionary.jetpackcompose.R

@Composable
fun SharedPreferences(context: Context) {
    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var savedData by remember { mutableStateOf("") }
    Column(
        modifier = Modifier.fillMaxSize().padding(horizontal = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            modifier = Modifier.size(100.dp).clip(CircleShape),
            painter = painterResource(R.drawable.img),
            contentDescription = null,
            contentScale = ContentScale.Crop

        )
        Spacer(modifier = Modifier.height(30.dp))
        TextField(
            modifier = Modifier.fillMaxWidth(),
            value = username,
            onValueChange = {username=it},
            label = { Text("Username") }
        )
        Spacer(modifier = Modifier.height(10.dp))
        TextField(
            modifier = Modifier.fillMaxWidth(),
            value = password,
            onValueChange = {password=it},
            label = { Text("Password") }
        )
        Spacer(modifier = Modifier.height(24.dp))
        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = {
                val sharedPref=context.getSharedPreferences("MyPref", Context.MODE_PRIVATE)
                sharedPref.edit {
                    putString("username",username)
                    putString("password",password)
                }
            }
        ) {
            Text("Save Data")
        }
        Spacer(modifier = Modifier.height(15.dp))
        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = {
                val sharedPref=context.getSharedPreferences("MyPref", Context.MODE_PRIVATE)
                sharedPref.edit {
                    clear()
                }
            }
        ) {
            Text(" Clear Data")
        }
        Spacer(modifier = Modifier.height(15.dp))
        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = {
                val sharedPref=context.getSharedPreferences("MyPref", Context.MODE_PRIVATE)
                val savedUserName=sharedPref.getString("username","No UserName")
                val savedPassword=sharedPref.getString("password","No password")
                savedData="UserName: $savedUserName\n Password: $savedPassword"
            }
        ) {
            Text("Show Data")
        }
        Spacer(modifier = Modifier.height(10.dp))
        if (savedData.isNotEmpty()){
            Text(
                text =savedData,
            )
        }

    }
}