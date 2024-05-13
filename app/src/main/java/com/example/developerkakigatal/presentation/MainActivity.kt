package com.example.developerkakigatal.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.developerkakigatal.data.DummyMovie
import com.example.developerkakigatal.presentation.ui.MovieHomeScreen.MovieHomeScreen
import com.example.developerkakigatal.presentation.ui.MovieHomeScreen.components.MovieList
import com.example.developerkakigatal.presentation.ui.theme.DeveloperKakiGatalTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DeveloperKakiGatalTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MoviesApp()
                }
            }
        }
    }
}
