package com.example.app_perfulandia.ui.screens

import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import com.example.app_perfulandia.ui.utils.obtenerWindowSizeClass

@Composable
fun HomeScreen() {
    val windowSizeClass = obtenerWindowSizeClass()
    when (windowSizeClass.widthSizeClass) {
        WindowWidthSizeClass.Compact -> HomeScreenCompacta()
        WindowWidthSizeClass.Medium -> HomeScreenMediana()
        WindowWidthSizeClass.Expanded -> HomeScreenExpandida()
    }
}