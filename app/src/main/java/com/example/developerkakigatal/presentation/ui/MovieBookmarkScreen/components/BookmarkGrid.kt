package com.example.developerkakigatal.presentation.ui.MovieBookmarkScreen.components


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.developerkakigatal.data.DummyMovie
import com.example.developerkakigatal.model.Movie
import com.example.developerkakigatal.navigation.Screen

@Composable
fun BookmarkGrid(
    navController: NavController,
    movies: List<Movie> = DummyMovie.MoviesData,
) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        modifier = Modifier.padding(start = 8.dp, end = 8.dp)

    ) {
        items(movies, key =  {it.id}) {
            BookmarkItem(movie = it) { movieId ->
                navController.navigate(Screen.Detail.route + "/$movieId")
            }
        }
    }
}