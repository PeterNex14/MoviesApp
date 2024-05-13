package com.example.developerkakigatal.presentation.ui.MovieBookmarkScreen

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.developerkakigatal.presentation.ui.MovieBookmarkScreen.components.BookmarkGrid

@Composable
fun BookmarkScreen(
    navController: NavController,
    modifier : Modifier = Modifier,
) {
    BookmarkGrid(navController)
}