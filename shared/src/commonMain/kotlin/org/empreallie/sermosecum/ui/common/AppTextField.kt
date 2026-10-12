package org.empreallie.sermosecum.ui.common

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.empreallie.sermosecum.ui.theme.AppTheme

@Composable
fun AppTextField(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
) {
    BasicTextField(
        value = value,
        onValueChange = onValueChange,
        modifier = modifier,
        decorationBox = { innerTextField ->
            Box(
                modifier = Modifier
                    .background(AppTheme.colors.secondaryBackground, RoundedCornerShape(8.dp))
                    .border(1.dp, AppTheme.colors.outline, RoundedCornerShape(8.dp))
                    .padding(horizontal = 15.dp, vertical = 10.dp)
            ) {
                if (value.isEmpty()) {
                    Text(
                        text = "Сообщение...", // TODO вынести в мультиплатформенные ресурсы
                        style = TextStyle(
                            color = AppTheme.colors.secondaryText,
                            fontSize = 13.sp
                        )
                    )
                }
                innerTextField()
            }

        }
    )
}