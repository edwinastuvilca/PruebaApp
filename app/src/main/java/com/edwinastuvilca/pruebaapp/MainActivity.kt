package com.edwinastuvilca.pruebaapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModel
import com.edwinastuvilca.pruebaapp.ui.hi.HiScreen
import com.edwinastuvilca.pruebaapp.ui.hi.HiViewModel
import com.edwinastuvilca.pruebaapp.ui.theme.PruebaAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PruebaAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize()
                        .background(Color.Black),
                    color = MaterialTheme.colorScheme.background,
                ) {
                    HiScreen(HiViewModel())
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column{
        Text(
            text = "Hello $name!",
            modifier = modifier
        )
        EmailField()
    }

}

@Composable
fun EmailField(){
    /*TextField(
        value = "", onValueChange = { },
        modifier = Modifier.fillMaxWidth(),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
        singleLine = true,
        maxLines = 1
    )*/
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PruebaAppTheme {
        Greeting("Android")
    }
}