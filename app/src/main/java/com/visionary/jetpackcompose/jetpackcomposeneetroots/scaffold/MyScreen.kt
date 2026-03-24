package com.visionary.jetpackcompose.jetpackcomposeneetroots.scaffold

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Preview(showSystemUi = true)
@Composable
private fun MyScreenExample() {
    Scaffold(
       modifier = Modifier.fillMaxSize(),
        topBar = {TopBarExample()},
        bottomBar = {BottomBarExample()},
        floatingActionButton = {FlotingActionButtonExample()},
        content ={PaddingValues(12.dp)}
    )
}