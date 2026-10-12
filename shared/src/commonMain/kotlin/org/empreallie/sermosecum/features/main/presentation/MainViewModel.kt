package org.empreallie.sermosecum.features.main.presentation

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update
import org.empreallie.sermosecum.features.main.domain.ChatMessage
import kotlin.collections.plus

class MainViewModel: ViewModel() {
    private val _state = MutableStateFlow(MainState())
    val state: StateFlow<MainState> = _state

    fun onEvent(event: MainEvents) {
        when (event) {
            is MainEvents.TextChanged -> {
                _state.update { it.copy(textInTextField = event.newText) }
            }

            is MainEvents.SendButtonClicked -> {
                _state.update {
                    it.copy(
                        textInTextField = "",
                        messageList = it.messageList + ChatMessage(it.textInTextField, "00:00")
                    )
                }
            }
        }
    }
}