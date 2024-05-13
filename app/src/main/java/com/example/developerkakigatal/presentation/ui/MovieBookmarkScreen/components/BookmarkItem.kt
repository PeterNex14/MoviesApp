package com.example.developerkakigatal.presentation.ui.MovieBookmarkScreen.components


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.BookmarkBorder
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.developerkakigatal.model.Movie

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BookmarkItem(
    movie: Movie,
    onItemClicked: (Int) -> Unit,
) {
    ElevatedCard(onClick = { onItemClicked(movie.id) }, modifier = Modifier.size(width = 180.dp, height = 260.dp)) {
        Box(

        ) {
            Image(
                painter = painterResource(id = movie.image),
                contentDescription = stringResource(id = movie.title),
                contentScale = ContentScale.FillWidth

            )
            Icon(
                imageVector = Icons.Filled.BookmarkBorder,
                tint = Color.Yellow,
                contentDescription = null,
                modifier = Modifier.align(Alignment.TopEnd).padding(end = 6.dp, top = 6.dp)
            )
        }
    }
}

