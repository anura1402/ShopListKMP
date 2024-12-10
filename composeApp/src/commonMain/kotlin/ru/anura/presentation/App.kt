package ru.anura.presentation

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import ru.anura.Greeting
import ru.anura.domain.Screen

import shoplistkmp.composeapp.generated.resources.Res
import shoplistkmp.composeapp.generated.resources.compose_multiplatform

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
        Screen.SHOP_LIST -> ShopList()
    }
}