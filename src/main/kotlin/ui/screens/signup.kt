package ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier

@Composable
fun SignUp(onNavigateToLogin : () -> Unit) {
    Column {
        Button(onClick = { onNavigateToLogin},
            modifier = Modifier.fillMaxWidth()){
                Text("Login")
        }
    }
}