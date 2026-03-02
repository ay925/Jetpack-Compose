package com.visionary.jetpackcompose.jetpackcompose.scaffold

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ScaffoldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showSystemUi = true)
@Composable
fun TopBarExample(modifier: Modifier = Modifier) {
    TopAppBar(
        modifier = Modifier.fillMaxWidth(),
        title ={
            Text(
            text = "Top App Bar",
            fontWeight = FontWeight.Bold
        )},
        navigationIcon = {IconButton(onClick = {}){ Icon(imageVector = Icons.Default.Menu, contentDescription = "Menu") }},
        actions = {
            IconButton(onClick = {}) {
                Icon(imageVector = Icons.Default.Search,contentDescription = null)
            }
            IconButton(onClick = {}) {
                Icon(imageVector = Icons.Default.MoreVert,contentDescription = null)
            }
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color.Blue,
            titleContentColor = Color.White,
            navigationIconContentColor = Color.White,
            actionIconContentColor = Color.White
        )
    )
}