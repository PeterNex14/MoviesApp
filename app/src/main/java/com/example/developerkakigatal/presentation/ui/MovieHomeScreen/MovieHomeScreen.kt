package com.example.developerkakigatal.presentation.ui.MovieHomeScreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.developerkakigatal.data.DummyMovie
import com.example.developerkakigatal.model.Movie
import com.example.developerkakigatal.presentation.ui.MovieHomeScreen.components.MovieCard
import com.example.developerkakigatal.presentation.ui.MovieHomeScreen.components.MovieCardList
import com.example.developerkakigatal.presentation.ui.MovieHomeScreen.components.MovieList

@Composable
fun MovieHomeScreen(
    navController: NavController,
    movie : List<Movie> = DummyMovie.MoviesData,
    modifier: Modifier = Modifier
) {
    Column(

    ){
        Text(
            text = "Trending",
            fontSize = 24.sp,
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier.padding(
                horizontal = 12.dp
            )
        )
        MovieList(movies = movie, navController = navController)
        Spacer(modifier = Modifier.padding(16.dp))
        Text(
            text = "Most Watched",
            fontSize = 24.sp,
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier.padding(
                horizontal = 12.dp
            )
        )
        Spacer(modifier = Modifier.padding(4.dp))
        MovieCardList(movies = movie, navController = navController)
    }

}