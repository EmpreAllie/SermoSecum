package org.empreallie.sermosecum.ui.colors

import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color

@Immutable
class AppColors(
    val primaryBackground: Color,
    val secondaryBackground: Color,
    val primaryButton: Color,
    val sendButton: Color,
    val outline: Color,
    val primaryText: Color,
    val secondaryText: Color,
)

val lightColors = AppColors(
    primaryBackground = Color(0xFFF4F5F9),
    secondaryBackground = Color(0xFFF1F5F9),
    primaryButton = Color(0xFFCBD5E1),
    sendButton = Color(0xFF5C6AC4),
    outline = Color(0xFFCBD5E1),
    primaryText = Color(0xFF0F172A),
    secondaryText = Color(0xFF64748B),
)

val darkColors = AppColors(
    primaryBackground = Color(0xFF0F172A),
    secondaryBackground = Color(0xFF334155),
    primaryButton = Color(0xFF334155),
    sendButton = Color(0xFF7C8AE8),
    outline = Color(0xFF334155),
    primaryText = Color(0xFFF1F5F9),
    secondaryText = Color(0xFF94A3B8),
)