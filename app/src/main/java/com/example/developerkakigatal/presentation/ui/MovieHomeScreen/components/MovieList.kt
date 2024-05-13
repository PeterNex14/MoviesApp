package com.example.developerkakigatal.presentation.ui.MovieHomeScreen.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.developerkakigatal.data.DummyMovie
import com.example.developerkakigatal.model.Movie
import com.example.developerkakigatal.navigation.Screen

@Composable
fun MovieList(
    navController: NavController,
    movies: List<Movie>,
    modifier: Modifier = Modifier
) {
    LazyRow(
        modifier = Modifier
            .fillMaxWidth(),
        contentPadding = PaddingValues(start = 12.dp, end = 12.dp)
    ) {
        items(movies, key = {it.id}){
            MovieItem(movie = it) {movieId ->
                navController.navigate(Screen.Detail.route + "/$movieId")
            }
        }
    }
}

