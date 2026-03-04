package com.visionary.jetpackcompose.jetpackcompose.navigationBar

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun NavHomeScreen(navController: NavHostController) {
    Scaffold(
        bottomBar = {MyNavBar(navController,"Home")}
    ) {
        innerPadding->
        Box(
            modifier = Modifier.fillMaxSize().padding(innerPadding),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Home screen",
                fontWeight = FontWeight.Bold,
                fontSize = 40.sp
            )
        }
    }
}
