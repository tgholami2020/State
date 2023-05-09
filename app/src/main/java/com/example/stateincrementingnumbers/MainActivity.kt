package com.example.stateincrementingnumbers

import android.os.Bundle
import android.text.Layout.Alignment
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.stateincrementingnumbers.ui.theme.StateIncrementingNumbersTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StateIncrementingNumbersTheme {
                var count by remember{                         //initial the count as a state value to be change
                    mutableStateOf(0)
                }
               Column (modifier = Modifier.fillMaxSize(),
               verticalArrangement = Arrangement.Center,

                   ){
                   Text(text = count.toString(),               //count changeable
                   color= Color.Blue
                       )
                   Button(onClick = {
                       count++                                //by clicking the button the number increment
                   }) {
                       Text(text = "click me to increment: $count")
                   }

               }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    StateIncrementingNumbersTheme {
        Greeting("Android")
    }
}