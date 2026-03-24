package com.visionary.jetpackcompose.jetpackcomposeneetroots.scaffold

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
@Preview(showSystemUi = true)
@Composable
fun FlotingActionButtonExample(modifier: Modifier = Modifier) {
    FloatingActionButton(
        onClick = {},
        containerColor = Color.Blue,
        contentColor = Color.White
    ) {
        Icon(imageVector = Icons.Default.Add,contentDescription = null)
    }
}