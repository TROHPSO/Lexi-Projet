package ui.screens

import androidx.compose.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.AlertDialog
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.key
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Vertical
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.key.onKeyEvent
import androidx.compose.ui.input.key.Key

@Composable
fun Popup(
    openDialog: Boolean,
    onDismiss: () -> Unit
){  
    var titre by remember { mutableStateOf("") }
    var description by remember { mutableStateOf("") }
    var tags by remember { mutableStateOf("") }

    


    MaterialTheme {
        if(openDialog){
            AlertDialog(
                onDismissRequest = { onDismiss() },
                title = { Text("Ajoutez une collection") },
                text = {
                    Column {
                        Text("Titre")
                        TextField(
                            value = titre,
                            onValueChange = { titre = it},          // à récupérer
                            modifier = Modifier.fillMaxWidth()
                            
                        )

                        Text("Description")
                        TextField(
                            value = description,
                            onValueChange = { description = it},    // à récupérer
                            modifier = Modifier.fillMaxWidth()
                        )

                        Text("Tags")
                        TextField(
                            value = tags,
                            onValueChange = { tags = it},           // à récupérer
                            modifier = Modifier.fillMaxWidth()
                        )

                    }
                },
                buttons = {
                    Column(
                        modifier = Modifier.fillMaxWidth(),
                        verticalArrangement = Arrangement.Top,
                        horizontalAlignment = Alignment.CenterHorizontally,

                    ) {

                        TextButton(onClick = { 
                                println(titre)
                                println(description)
                                println(tags)
                            onDismiss() }) { Text("Ajouter") }
                        // Clique bouton ajouter 
                        // Afficher Titre Description Tags

                        
                        TextButton(onClick = { onDismiss() }) { Text("Annuler") }
                    }

                }
            )
        }
    }
}
