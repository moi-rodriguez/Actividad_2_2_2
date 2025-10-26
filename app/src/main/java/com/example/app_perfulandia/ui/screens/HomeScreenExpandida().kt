package com.example.app_perfulandia.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.app_perfulandia.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreenExpandida() {
    Scaffold(
        topBar = {
            TopAppBar(title = { Text(text = "Mi App Kotlin") })
        }
    ) { innerPadding ->
        Row(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
                .padding(32.dp), // Más padding para pantallas grandes
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Columna para texto y botón
            Column(
                modifier = Modifier.weight(1f),
                horizontalAlignment = Alignment.CenterHorizontally, // Centra el contenido horizontalmente
                verticalArrangement = Arrangement.spacedBy(24.dp)
            ) {
                Text(
                    text = "¡Bienvenido a la experiencia completa!", // Texto más descriptivo
                    color = MaterialTheme.colorScheme.primary,
                    style = MaterialTheme.typography.headlineLarge // Texto más grande
                )
                Button(onClick = { /* acción futura */ }) {
                    Text("Presióname", style = MaterialTheme.typography.titleMedium) // Texto del botón más grande
                }
            }
            // Imagen a la derecha, más grande
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "Logo App",
                modifier = Modifier
                    .weight(1.5f) // Le damos más peso a la imagen
                    .fillMaxHeight(0.6f), // Ocupa el 60% de la altura
                contentScale = ContentScale.Fit
            )
        }
    }
}

@Preview(name = "Expanded", widthDp = 1200, heightDp = 800)
@Composable
fun PreviewExpanded() {
    HomeScreenExpandida()
}