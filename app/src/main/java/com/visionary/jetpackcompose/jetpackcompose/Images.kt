package com.visionary.jetpackcompose.jetpackcompose

import android.graphics.drawable.Icon
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.visionary.jetpackcompose.R

@Composable
private fun ImageExample() {
    Image(
        painter = painterResource(R.drawable.img),
        contentDescription = null,
        modifier = Modifier
            .padding(16.dp)
            .size(300.dp)
            .clip(RoundedCornerShape(16.dp)),
        contentScale = ContentScale.Fit

    )
}
@Preview(showSystemUi = true)
@Composable
fun IconExample() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Icon(imageVector = Icons.Default.Person,
            contentDescription = null,
            modifier = Modifier.size(1000.dp)
        )
    }

}