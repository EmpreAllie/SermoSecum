package org.empreallie.sermosecum.features.main.presentation

import org.empreallie.sermosecum.features.main.domain.ChatMessage

data class MainState(
    val textInTextField: String = "",
    val messageList: List<ChatMessage> = mutableListOf(),
)
