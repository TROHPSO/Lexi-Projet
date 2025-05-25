package ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.LeadingIconTab
import androidx.compose.material.Text
import androidx.compose.material3.Divider
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.skia.FontWeight
import org.jetbrains.skia.paragraph.Alignment

@Composable
fun SignUp(onNavigateToLogin: () -> Unit) {
    var username        by remember { mutableStateOf("") }
    var email           by remember { mutableStateOf("") }
    var password        by remember { mutableStateOf("") }
    var confirmPassword by remember { mutableStateOf("") }


    Box(
        contentAlignment = androidx.compose.ui.Alignment.Center,
        modifier         = Modifier.fillMaxSize().padding(horizontal = 16.dp)
    ){
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally
        ) {

            Text(
                "Sign-Up",
                fontSize = 28.sp,
                fontWeight = androidx.compose.ui.text.font.FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth().padding(vertical = 32.dp)
            )

            OutlinedTextField(
                value           = username,
                onValueChange   = { username = it },
                label           = { Text("Username")},
                modifier        = Modifier.fillMaxWidth(),
                singleLine      = true
            )

            OutlinedTextField(
                value           = email,
                onValueChange   = { email = it },
                label           = { Text("Email")},
                modifier        = Modifier.fillMaxWidth(),
                singleLine      = true
            )

            OutlinedTextField(
                value           = password,
                onValueChange   = { password = it },
                label           = { Text("Password")},
                modifier        = Modifier.fillMaxWidth(),
                singleLine      = true,
                visualTransformation = PasswordVisualTransformation()
            )

            OutlinedTextField(
                value           = confirmPassword,
                onValueChange   = { confirmPassword = it },
                label           = { Text("Confirm Password")},
                modifier        = Modifier.fillMaxWidth(),
                singleLine      = true,
                visualTransformation = PasswordVisualTransformation(),
            )

            Button(
                onClick     = { },
                modifier    = Modifier.fillMaxWidth().padding(top = 10.dp),
            ){
                Text("Sign-in")
            }

            Divider(
                modifier = Modifier.padding(top = 10.dp, bottom = 10.dp), thickness = 3.dp, color = Color.LightGray)

            Text(
                text        = "Dèja un compte",
                fontSize    = 16.sp,
                fontWeight  = androidx.compose.ui.text.font.FontWeight.Light,
                textAlign   = TextAlign.Center
            )

            Button(
                onClick     = { onNavigateToLogin() },
                modifier    = Modifier.fillMaxWidth().padding(top = 10.dp)) {
                Text("Login")
            }
        }
    }


}