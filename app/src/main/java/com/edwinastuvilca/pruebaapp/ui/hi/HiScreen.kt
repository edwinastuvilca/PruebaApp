@file:OptIn(ExperimentalMaterial3Api::class)

package com.edwinastuvilca.pruebaapp.ui.hi

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.edwinastuvilca.pruebaapp.components.TitleView

@Composable
fun HiScreen(viewModel: HiViewModel){
    Box(
        Modifier
            .fillMaxSize()
            .background(Color.Black)
            .padding(16.dp)
    ) {
        Hi(Modifier.align(Alignment.Center), viewModel)
    }
}

@Composable
private fun Hi(modifier: Modifier, viewModel: HiViewModel){
    Column(modifier = modifier){
        TitleView("Hi!")
        Column(
            modifier = Modifier
                .padding(20.dp)
                .background(MaterialTheme.colorScheme.secondary)
                .border(
                    width = 2.dp,
                    color = Color.White,
                )
        ){
            SimpleFilledTextFieldSample(
                text = "Correo Electrónico",
            )
            ContinueButton(
                text = "Continue",
            )
        }
    }
}

@Composable
fun SimpleFilledTextFieldSample(text: String) {
    TextField(
        value = "", onValueChange = {},
        modifier = Modifier
            .border(
                width = 1.dp,
                color = MaterialTheme.colorScheme.primary
            )
    )
}

@Composable
fun ContinueButton(text: String){
    Button(
        onClick = { /*TODO*/ },
        Modifier
            .background(MaterialTheme.colorScheme.primary)
            .padding(start = 10.dp, end = 10.dp)
            .fillMaxWidth(),
    ) {
        Text(text = text)
    }
}