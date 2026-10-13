package org.empreallie.sermosecum.features.main.presentation

import org.empreallie.sermosecum.features.main.domain.ChatMessage

sealed interface MainEvents {
    data class TextChanged(val newText: String) : MainEvents

    data object SendButtonClicked : MainEvents
}