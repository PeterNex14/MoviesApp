package com.example.developerkakigatal.presentation.ui.MovieHomeScreen.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.developerkakigatal.data.DummyMovie
import com.example.developerkakigatal.model.Movie
import com.example.developerkakigatal.navigation.Screen

@Composable
fun MovieCardList(
    navController: NavController,
    movies: List<Movie> = DummyMovie.MoviesData,
    modifier: Modifier = Modifier
) {
    LazyColumn(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(12.dp)

    ) {
        items(movies, key = { it.id }){
            MovieCard(movie = it) { movieId ->
                navController.navigate(Screen.Detail.route + "/$movieId")
            }
        }
    }
}