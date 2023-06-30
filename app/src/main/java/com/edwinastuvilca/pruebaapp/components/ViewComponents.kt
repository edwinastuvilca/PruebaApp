package com.edwinastuvilca.pruebaapp.components

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight

@Composable
fun TitleView(text: String){
    Text(
        text = text,
        color = Color.White,
        fontSize = MaterialTheme.typography.displayMedium.fontSize,
        fontFamily = MaterialTheme.typography.displayLarge.fontFamily,
        fontWeight = FontWeight.Bold,
    )
}