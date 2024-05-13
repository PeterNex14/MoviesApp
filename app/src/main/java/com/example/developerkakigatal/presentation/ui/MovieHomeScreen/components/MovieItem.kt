package com.example.developerkakigatal.presentation.ui.MovieHomeScreen.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.developerkakigatal.data.DummyMovie
import com.example.developerkakigatal.model.Movie

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MovieItem(
    movie: Movie,
    modifier: Modifier = Modifier,
    onItemClicked: (Int) -> Unit
) {
    Card(modifier = modifier.clickable { onItemClicked(movie.id) }) {
        Image(
            painterResource(id = movie.image),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .size(width = 180.dp, height = 260.dp)
                .clip(RoundedCornerShape(12.dp)),


            )
    }

}