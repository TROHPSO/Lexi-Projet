package ui.screens

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.toggleable
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.Divider
import androidx.compose.material.darkColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
@Preview
fun Login(onNavigateToSignup: () -> Unit) {
    var email       by remember { mutableStateOf("") }
    var password    by remember { mutableStateOf("") }

    MaterialTheme {
        Column(
            modifier = Modifier.fillMaxSize().padding(horizontal = 16.dp),
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text        = "Login",
                fontSize    = 28.sp,
                fontWeight  = FontWeight.Bold,
                textAlign   = TextAlign.Center,
                modifier    = Modifier.fillMaxWidth().padding(vertical = 32.dp)
            )
            
            OutlinedTextField(
                value           = email,
                onValueChange   = { email = it },
                label           = { Text(text = "Email") },
                modifier        = Modifier.fillMaxWidth(),
                singleLine      = true,
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Email,
                    imeAction    = ImeAction.Next
                )
            )
            
            Spacer(modifier = Modifier.padding(vertical = 16.dp))

            OutlinedTextField(
                value           = password,
                onValueChange   = { password = it },
                label           = { Text(text = "Password") },
                modifier        = Modifier.fillMaxWidth(),
                singleLine      = true,
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Password,
                    imeAction    = ImeAction.Done
                )
            )

            Spacer(modifier = Modifier.padding(vertical = 16.dp))

            Button(
                onClick = {},
                modifier = Modifier.fillMaxWidth()
            ){
                Text(text = "Login")
            }

            Divider(thickness = 3.dp, color = Color.LightGray)

            Column(
                modifier = Modifier.fillMaxWidth().padding(horizontal = 32.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text       = "Créer un compte",
                    fontWeight = FontWeight.Light,
                    textAlign  = TextAlign.Center
                )
            }

            Button(
                onClick = { onNavigateToSignup() },
                modifier = Modifier.fillMaxWidth()){
                    Text("Sign-Up")
                }
        }
    }
}

