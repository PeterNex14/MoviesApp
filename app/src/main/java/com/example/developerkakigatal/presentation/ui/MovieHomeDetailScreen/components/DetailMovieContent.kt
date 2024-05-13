package com.example.developerkakigatal.presentation.ui.MovieHomeDetailScreen.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.developerkakigatal.R
import com.example.developerkakigatal.model.Movie

@Composable
fun DetailMovieContent(
    navController: NavController,
    newMovieList: List<Movie>,
    modifier: Modifier = Modifier
) {
    Column {
        Box(modifier = Modifier
            .size(width = 600.dp, height = 300.dp)
            .background(color = MaterialTheme.colorScheme.background)
        ) {
            Image(
                painter = painterResource(id = newMovieList[0].image),
                contentDescription = stringResource(newMovieList[0].title),
                contentScale = ContentScale.Crop,
                modifier = Modifier.align(
                    Alignment.Center
                )
            )
        }
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ){
            Text(
                text = stringResource(id = newMovieList[0].title),
                style = MaterialTheme.typography.headlineMedium,
                fontWeight = FontWeight.SemiBold,
            )
            Row{
                Icon(
                    imageVector = Icons.Filled.Star,
                    contentDescription = null,
                    tint = Color.Yellow,
                    modifier = Modifier.align(
                        Alignment.CenterVertically
                    )
                )
                Spacer(modifier = Modifier.width(4.dp))
                Text(
                    text = newMovieList[0].rating,
                    style = MaterialTheme.typography.bodyLarge,
                    modifier = Modifier.align(
                        Alignment.CenterVertically
                    )
                )
            }
        }
        Text(text = newMovieList[0].genre, style = MaterialTheme.typography.bodyMedium)
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = stringResource(id = newMovieList[0].description)
        )


    }
}