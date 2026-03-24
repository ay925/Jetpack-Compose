package com.visionary.jetpackcompose.jetpackcomposeneetroots.scaffold

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.visionary.jetpackcompose.R

@Preview(showSystemUi = true)
@Composable
fun BottomBarExample(modifier: Modifier = Modifier) {
    BottomAppBar(
        modifier= Modifier.fillMaxWidth(),

    ) {
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceAround) {
            IconButton(onClick = {}) {
                Icon(imageVector = Icons.Default.Home, contentDescription = null)
            }
            IconButton(onClick = {}) {
                Icon(imageVector = Icons.Default.Search, contentDescription = null)
            }
            IconButton(onClick = {}) {
                Icon(
                    modifier = Modifier.size(20.dp),
                    painter = painterResource(R.drawable.img_1),
                    contentDescription = null
                )
            }
            IconButton(onClick = {}) {
                Icon(imageVector = Icons.Default.Person, contentDescription = null)
            }
        }
    }
}