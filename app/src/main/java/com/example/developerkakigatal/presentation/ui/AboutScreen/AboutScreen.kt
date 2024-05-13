package com.example.developerkakigatal.presentation.ui.AboutScreen

import android.graphics.drawable.shapes.Shape
import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

import com.example.developerkakigatal.R

@Preview
@Composable
fun AboutScreen() {
    Column(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(40.dp))
        Box(
            modifier = Modifier.size(100.dp)
                .clip(CircleShape)
                .align(Alignment.CenterHorizontally)
        ) {
            Image(
                painter = painterResource(R.drawable.gabs),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.clipToBounds()
            )
        }
        Spacer(
            modifier = Modifier.height(20.dp)
        )
        Text(
            text = "Peter Gabriel Sompotan",
            style = MaterialTheme.typography.headlineSmall
        )
        Text(
            text = "peternex42@gmail.com"
        )
        Text(
            text = "Universitas Sam Ratulangi"
        )
        Text(
            text = "Teknik Informatika"
        )
    }
}