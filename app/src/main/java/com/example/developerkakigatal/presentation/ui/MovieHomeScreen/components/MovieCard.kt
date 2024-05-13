package com.example.developerkakigatal.presentation.ui.MovieHomeScreen.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.developerkakigatal.model.Movie

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MovieCard(
    movie: Movie,
    onItemClicked: (Int) -> Unit
) {
    ElevatedCard(
        shape = RoundedCornerShape(10.dp),
        elevation = CardDefaults.elevatedCardElevation(4.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 12.dp)
            .clickable {
                onItemClicked(movie.id)
            },
    ) {
        Row(){
            Image(
                painterResource(id = movie.image),
                contentDescription = null,
                modifier = Modifier.size(width = 70.dp, height = 100.dp),
                contentScale = ContentScale.FillHeight

            )
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.SpaceBetween

            ) {
                Text(stringResource(id = movie.title), fontSize = 20.sp)
                Row() {
                    Icon(
                        imageVector = Icons.Filled.Star,
                        contentDescription = null,
                        tint = Color.Yellow
                    )
                    Text(text = movie.rating)
                }

            }
        }

    }
}