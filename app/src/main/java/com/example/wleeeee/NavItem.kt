package com.example.wleeeee

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.Dp


data class NavItem(
    val label : String,
    val Icon : ImageVector,
)

data class FileItems(
    val label : String,
    val caption: String
)

data class Item(
    val title: String,
    @DrawableRes val image: Int
)

data class ListItem(
    val height: Dp,
    val color: Color
)

