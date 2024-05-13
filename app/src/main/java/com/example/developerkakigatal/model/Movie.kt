package com.example.developerkakigatal.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.ui.graphics.painter.Painter

data class Movie(
    val id: Int,
    val image: Int,
    val title: Int,
    val rating: String,
    val description: Int,
    val genre: String,
)
