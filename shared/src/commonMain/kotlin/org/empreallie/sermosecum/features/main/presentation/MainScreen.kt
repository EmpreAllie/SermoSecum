package org.empreallie.sermosecum.features.main.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import org.empreallie.sermosecum.features.main.domain.ChatMessage
import org.empreallie.sermosecum.features.main.presentation.ui.SendButton
import org.empreallie.sermosecum.ui.common.AppTextField
import org.empreallie.sermosecum.ui.theme.AppTheme

@Composable
@Preview
fun MainScreen(
    viewModel: MainViewModel = viewModel { MainViewModel() }
) {
    val state by viewModel.state.collectAsState()

    AppTheme {

        Column(
            modifier = Modifier
                .background(AppTheme.colors.primaryBackground)
                .safeContentPadding()
                .fillMaxSize(),
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(60.dp)
                    .background(AppTheme.colors.secondaryBackground)
                    .border(1.dp, AppTheme.colors.outline)
            ) {

            }

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .border(1.dp, AppTheme.colors.outline)
            ) {

            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .border(1.dp, AppTheme.colors.outline)
                    .padding(horizontal = 10.dp, vertical = 5.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {

                AppTextField(
                    value = state.textInTextField,
                    onValueChange = { newVal ->
                        viewModel.onEvent(MainEvents.TextChanged(newVal))
                    },
                    modifier = Modifier
                        .weight(1f)
                        .padding(horizontal = 10.dp, vertical = 6.dp)
                )

                Spacer(modifier = Modifier.width(10.dp))

                SendButton(
                    onClick = {
                        viewModel.onEvent(MainEvents.SendButtonClicked)
                    }
                )

            }
        }

    }

}