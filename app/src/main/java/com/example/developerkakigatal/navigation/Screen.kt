package com.example.developerkakigatal.navigation

sealed class Screen(val route: String) {
    data object Home: Screen("home")
    data object Bookmark: Screen( "bookmark")
    data object About: Screen("about")
    data object Detail: Screen("detail")
}