package com.example.developerkakigatal.presentation

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.BookmarkBorder
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavGraph.Companion.findStartDestination

import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.Navigation
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.developerkakigatal.R
import com.example.developerkakigatal.data.DummyMovie
import com.example.developerkakigatal.navigation.NavigationItem
import com.example.developerkakigatal.navigation.Screen
import com.example.developerkakigatal.presentation.ui.AboutScreen.AboutScreen
import com.example.developerkakigatal.presentation.ui.MovieBookmarkScreen.BookmarkScreen
import com.example.developerkakigatal.presentation.ui.MovieHomeDetailScreen.DetailScreen
import com.example.developerkakigatal.presentation.ui.MovieHomeScreen.MovieHomeScreen

@Composable
fun MoviesApp(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController()
) {
    Scaffold(
        bottomBar = {
            BottomBar(navController = navController)
        }
    ) {contentPadding ->
        NavHost(
            navController = navController,
            startDestination = Screen.Home.route,
            modifier = modifier.padding(contentPadding)
        ) {
            composable(Screen.Home.route) {
                MovieHomeScreen(navController = navController)
            }
            composable(
                Screen.Detail.route + "/{movieId}",
                arguments = listOf(navArgument("movieId") {type = NavType.IntType})
            ) {navBackStackEntry ->
                DetailScreen(
                    navController = navController,
                    moviesId = navBackStackEntry.arguments?.getInt("movieId"),

                )
            }
            composable(Screen.Bookmark.route) {
                BookmarkScreen(navController)
            }
            composable(Screen.About.route) {
                AboutScreen()
            }
        }
    }
}




@Composable
private fun BottomBar(
    navController: NavHostController,
    modifier : Modifier = Modifier
) {
    NavigationBar(
        modifier = modifier
    ){
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route

        val navigationItems = listOf(
            NavigationItem(
                title = stringResource(id = R.string.home),
                icon = Icons.Default.Home,
                screen = Screen.Home
            ),
            NavigationItem(
                title = stringResource(id = R.string.bookmark),
                icon = Icons.Default.BookmarkBorder,
                screen = Screen.Bookmark
            ),
            NavigationItem(
                title = stringResource(id = R.string.about),
                icon = Icons.Default.AccountCircle,
                screen = Screen.About
            )
        )
        navigationItems.map { item ->
            NavigationBarItem(
                selected = currentRoute == item.screen.route,
                onClick = {
                          navController.navigate(item.screen.route) {
                              popUpTo(navController.graph.findStartDestination().id) {
                                  saveState = true
                              }
                              restoreState = true
                              launchSingleTop = true
                          }
                          },
                icon = {
                    Icon(imageVector = item.icon, contentDescription = item.title)
                },
                label = {
                    Text(text = item.title)
                }
            )
        }
    }
}