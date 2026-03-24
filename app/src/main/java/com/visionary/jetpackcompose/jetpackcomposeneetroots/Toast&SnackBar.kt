package com.visionary.jetpackcompose.jetpackcomposeneetroots

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import kotlinx.coroutines.launch

@Preview
@Composable
private fun Toast() {
    val context=LocalContext.current
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center)
    {
        Button(onClick = {
            Toast.makeText(context,"This is Toast",Toast.LENGTH_LONG).show()
        }) {
            Text("Show Toast")
        }
    }
}

@Preview
@Composable
private fun SnackBar() {
    val snackBarHostState= remember { SnackbarHostState() }

    val scope= rememberCoroutineScope()
    Scaffold(
        snackbarHost = { SnackbarHost(hostState = snackBarHostState) }
    ) {innerPadding->
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center)
    {

            Button(modifier = Modifier.padding(innerPadding),
                onClick = {
                    scope.launch {
                        snackBarHostState.showSnackbar(
                            message = "This is SnackBar",
                        )
                    }
                }
            ) {
                Text("Show SnackBar")
            }
        }
    }
}