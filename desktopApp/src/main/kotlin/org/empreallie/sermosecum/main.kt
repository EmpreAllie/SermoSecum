package org.empreallie.sermosecum

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import org.empreallie.sermosecum.features.main.presentation.MainScreen

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "SermoSecum",
    ) {
        MainScreen()
    }
}