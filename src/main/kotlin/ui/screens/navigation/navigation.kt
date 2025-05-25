package ui.screens.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import ui.screens.Login
import ui.screens.SignUp

sealed class Screen {
    object Login     : Screen()
    object Signup    : Screen()
}

@Composable
fun Navigation(){
    val currentScreen = remember { mutableStateOf<Screen>(Screen.Login) }

    when (val screen = currentScreen.value) {
        is Screen.Login     -> Login(onNavigateToSignup = {currentScreen.value = Screen.Signup } )
        is Screen.Signup    -> SignUp(onNavigateToLogin = {currentScreen.value = Screen.Login } )
    }
}