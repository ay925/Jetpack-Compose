package com.visionary.jetpackcompose.jetpackcompose

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showSystemUi = true)
@Composable
fun AlertDialogExample() {
    var showDialog by remember { mutableStateOf(true) }
    val context = LocalContext.current
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Card(modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.White
            ), elevation = CardDefaults.cardElevation(
                defaultElevation = 15.dp,
                pressedElevation = 10.dp)) {
            Row(modifier = Modifier.fillMaxWidth().padding(20.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically) {
                Text(
                    modifier = Modifier,
                    text = "Alert Dialog",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold
                )
                IconButton(onClick = {
                    showDialog=true
                }, colors = IconButtonDefaults.iconButtonColors(
                    containerColor = Color.DarkGray,
                    contentColor = Color.LightGray
                )) {
                    Icon(imageVector = Icons.Default.Delete,
                        contentDescription = null)
                }
            }
        }






        if (showDialog) {
            AlertDialog(
                title = { Text("Delete Item") },
                text = { Text("Are you sure you want to delete this item") },
                onDismissRequest = { showDialog = false },
                confirmButton = {
                    Button(
                        onClick = {
                            Toast.makeText(
                                context,
                                "Deleted Item",
                                Toast.LENGTH_SHORT
                            )
                                .show()
                            showDialog = false
                        },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color.DarkGray,
                        )
                    ) {
                        Text("Delete")
                    }
                },
                dismissButton = {
                    Button(
                        onClick = { showDialog = false },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color.Gray,
                        )
                    ) {
                        Text("Cancel")
                    }
                },

                )
        }
    }
}