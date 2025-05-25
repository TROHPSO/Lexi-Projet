import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

import dev.lexi.ui.screens.Desktop
import ui.screens.Login
import ui.screens.navigation.Navigation


fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Lexi - Knowledge Base"
        ) {
        App()
    }
}

@Composable
fun App() {
    Navigation()
}