    package dev.lexi.ui.screens

    import androidx.compose.desktop.ui.tooling.preview.Preview
    import androidx.compose.foundation.BorderStroke
    import androidx.compose.foundation.background
    import androidx.compose.foundation.layout.Arrangement
    import androidx.compose.material.Button
    import androidx.compose.material.MaterialTheme
    import androidx.compose.material.Text
    import androidx.compose.material.TextField
    import androidx.compose.runtime.Composable
    import androidx.compose.runtime.getValue
    import androidx.compose.runtime.mutableStateOf
    import androidx.compose.runtime.remember
    import androidx.compose.runtime.setValue
    import androidx.compose.ui.window.Window
    import androidx.compose.ui.window.application
    import androidx.compose.foundation.layout.Box
    import androidx.compose.foundation.layout.Column
    import androidx.compose.foundation.layout.Spacer
    import androidx.compose.foundation.layout.fillMaxSize
    import androidx.compose.foundation.layout.fillMaxWidth
    import androidx.compose.foundation.layout.height
    import androidx.compose.foundation.layout.padding
    import androidx.compose.foundation.layout.size
    import androidx.compose.foundation.shape.RoundedCornerShape
    import androidx.compose.material.Card
    import androidx.compose.material.Colors
    import androidx.compose.ui.Alignment
    import androidx.compose.ui.Modifier
    import androidx.compose.ui.graphics.Color
    import androidx.compose.ui.input.key.Key
    import androidx.compose.ui.input.key.key
    import androidx.compose.ui.input.key.onKeyEvent
    import androidx.compose.ui.text.style.TextAlign
    import androidx.compose.ui.unit.TextUnit
    import androidx.compose.ui.unit.dp
    import androidx.compose.ui.unit.sp
    import org.jetbrains.skia.FontWeight
    import ui.screens.Popup
    import ui.screens.navigation.Navigation

    @Composable
    @Preview
      fun Desktop() {
        var text        by remember { mutableStateOf("Ajouter une collecton") }
        var searchText  by remember { mutableStateOf("") }

        val showPopup = remember { mutableStateOf(false) }

        MaterialTheme {
            Column(
                modifier            = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Button(onClick = {
                    showPopup.value = true
                    println("Ajout collection")
                }) {
                    Text(text)
                }

                if (showPopup.value){
                    Popup(
                        openDialog = showPopup.value,
                        onDismiss  = { showPopup.value = false }
                    )
                }

                Spacer(Modifier.height(10.dp))
        
                fun affichage(mot: String): String {

                    return mot
                }
        
                TextField(
                    value         = searchText,
                    onValueChange = { searchText = it },
                    singleLine    = true,
                    modifier      = Modifier.onKeyEvent { keyEvent ->
                        if (keyEvent.key == Key.Enter) {
                            println("vous avez appuyé sur une touche")
                            println(searchText)
                        }
                        true
                    },
                    placeholder = { Text("Rechercher mot") }
                )
            }
        }

        Collection(
            "Tech",
            24.sp,
            "Vocabulaire en informatiqeuefzjefjzef ijzefizejf izejf izejf izej fijezfizjefizjefizji fjziefjazlfejifz ",
            18.sp,
            "ekfzoekfzeofkozef",
            16.sp,
            )
    }

    @Composable
    fun Collection(
        titreCollection         : String,
        titreFontSize           : TextUnit = 24.sp,

        descriptionCollection   : String,
        descriptionFontSize     : TextUnit = 18.sp,

        tags                    : String,
        tagsFontSize            : TextUnit = 16.sp

    ) {
        /* 
        POP UP COLLECTION
        élement a
        */
        MaterialTheme {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier.fillMaxSize(),
            ) {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

                    Card(
                        border = BorderStroke(2.dp, Color.Black),
                        shape = RoundedCornerShape(10.dp),
                        modifier = Modifier.size(300.dp)
                    ) {

                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(16.dp)
                        ) {
                            Text( // Titre
                                text       = titreCollection,
                                fontSize   = titreFontSize,
                                fontWeight = androidx.compose.ui.text.font.FontWeight.Bold,
                                maxLines   = 1,
                                modifier   = Modifier
                                    .fillMaxWidth()
                                    .padding(bottom = 8.dp),
                                textAlign = TextAlign.Center
                            )

                            Text( // Description
                                text        = descriptionCollection,
                                fontSize    = descriptionFontSize,
                                fontWeight  = androidx.compose.ui.text.font.FontWeight.Normal,
                                modifier    = Modifier
                                    .fillMaxWidth()
                                    .padding(bottom = 8.dp)
                            )
                            Text( // Tags
                                text        = tags,
                                fontSize    = tagsFontSize,
                                fontWeight  = androidx.compose.ui.text.font.FontWeight.Medium,
                                modifier    = Modifier
                                    .fillMaxWidth()
                                    .padding(bottom = 30.dp)
                            )

                            Column(
                                modifier = Modifier.fillMaxSize(),
                                verticalArrangement = Arrangement.Bottom,
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Button(
                                    onClick = {
                                        println("Button clicked")
                                        // Ajoutez ici le code à exécuter lorsque le bouton est cliqué
                                    },
                                    //modifier = Modifier.fillMaxSize(),
                                    //true

                                ) {
                                    Text("Ouvrir")

                                }
                            }
                        }
                    }
                }
            }
        }
    }