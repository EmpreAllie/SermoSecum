package org.empreallie.sermosecum.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf
import org.empreallie.sermosecum.ui.colors.AppColors
import org.empreallie.sermosecum.ui.colors.lightColors
import org.empreallie.sermosecum.ui.colors.darkColors

@Composable
fun AppTheme(
    isDarkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {

    CompositionLocalProvider(
        LocalAppColors provides if (isDarkTheme) darkColors else lightColors,
        content = content,
    )

}

object AppTheme {
    val colors: AppColors
        @Composable get() = LocalAppColors.current
}

val LocalAppColors = staticCompositionLocalOf { lightColors }