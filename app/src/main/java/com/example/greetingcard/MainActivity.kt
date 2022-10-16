package com.example.greetingcard

import android.graphics.fonts.FontStyle
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.greetingcard.ui.theme.GreetingCardTheme
import androidx.compose.ui.text.font.FontStyle.Companion.Italic
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.text.style.TextDecoration

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GreetingCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    BirthdayGreetingWithImage("Happy Birthday Vava!")
                }
            }
        }
    }
}


@Composable
fun BirthdayGreetingWithText(message: String) {

        Text (
            text = message,
            fontSize = 38.sp,
            color = Color.DarkGray,
            fontFamily = FontFamily.Cursive,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(align = Alignment.CenterHorizontally)
                .padding(start = 16.dp, end = 16.dp, top = 675.dp)
        )
    }

@Composable
fun BirthdayGreetingWithImage(message: String) {

    val image = painterResource(R.drawable.vava)
    Box{
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth(),
            contentScale = ContentScale.Crop
        )
        BirthdayGreetingWithText(message = message)
    }
}

@Preview(showBackground = false)
@Composable
fun BirthdayGreetingCardWithImagePreview() {
    GreetingCardTheme {
        BirthdayGreetingWithImage("Happy Birthday Vava!")
    }
}