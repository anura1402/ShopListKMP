package ru.anura.presentation

import androidx.compose.runtime.*
import org.jetbrains.compose.ui.tooling.preview.Preview
import ru.anura.domain.entity.Screen

@Composable
@Preview
fun App() {
    // Состояние текущего экрана
    var currentScreen by remember { mutableStateOf(Screen.AUTH) }

    // Отображение экрана в зависимости от состояния
    when (currentScreen) {
        Screen.AUTH -> AuthorizationForm {
            currentScreen = Screen.SHOP_LIST
        }
        Screen.SHOP_LIST -> ItemList()
        Screen.ITEM_LIST -> TODO()
    }
}