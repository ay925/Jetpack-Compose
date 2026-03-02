package com.visionary.jetpackcompose.jetpackcompose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LazyColumnExample() {
    LazyColumn(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(4.dp),
        contentPadding = PaddingValues(2.dp)
    ) {
        items(50) { index ->

            Text(
                text = "Item $index",
                color = Color.White,
                modifier = Modifier
                    .background(Color.Black, RoundedCornerShape(8.dp))
                    .padding(20.dp),
                textAlign = TextAlign.Center,

                )
        }
    }
}

@Composable
private fun LazyRowExample() {
    LazyRow(
        modifier = Modifier.fillMaxSize(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(4.dp),
    ) {
        items(50) { index ->

            Text(
                text = "Item $index",
                color = Color.White,
                modifier = Modifier
                    .background(Color.Black, RoundedCornerShape(8.dp))
                    .padding(20.dp),
                textAlign = TextAlign.Center,

                )
        }
    }

}
@Preview(showSystemUi = true)
@Composable
fun NestedLazyList(modifier: Modifier = Modifier) {
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(4.dp),
        contentPadding = PaddingValues(horizontal = 20.dp, vertical = 30.dp)
    ) {
        items(20) { rowIndex ->
            Text(
                modifier = Modifier.padding(start = 20.dp),
                text = "Row $rowIndex",
                color = Color.Black,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
            LazyRow(
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                contentPadding = PaddingValues(20.dp)
            ) {
                items(15) { items ->
                    Row(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(Color.Gray, shape = RoundedCornerShape(20.dp))
                            .padding(20.dp)
                    ) {
                        Text(
                            text = "Column $items",
                            color = Color.Black,
                            fontSize = 20.sp,
                        )
                    }
                }
            }

        }
    }
}

@Composable
fun TypesOfItems(modifier: Modifier = Modifier) {
    Row(
        modifier = Modifier.fillMaxSize().padding(horizontal = 20.dp, vertical = 25.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        //item
        LazyColumn() {
            item { Text("Heder") }
        }
        //item (count)
        LazyColumn() {
            items(50){ index->
                Text("Item $index")

            }
        }
        val names=listOf("A","B","C","D","E")
        //item (list)
        LazyColumn(){
            items(names){name->
                Text("Name : $name")
            }
        }
        //itemIndexed
        LazyColumn() {
            val names=listOf("A","B","C","D","E")
            itemsIndexed(names) { index, name ->
                Text("Name $index : $name")
            }

    }
    }
}
