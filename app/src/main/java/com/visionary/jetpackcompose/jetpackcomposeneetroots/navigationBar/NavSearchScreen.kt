package com.visionary.jetpackcompose.jetpackcomposeneetroots.navigationBar

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
fun NavSearchScreen(navController: NavHostController) {
    Scaffold(
        bottomBar = {MyNavBar(navController,"Search") }
    ) { innerPadding ->
        Box(
            modifier = Modifier.fillMaxSize().padding(innerPadding),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Search screen",
                fontWeight = FontWeight.Bold,
                fontSize = 40.sp
            )
        }
    }
}