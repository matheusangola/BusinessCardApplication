package com.example.businesscard

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCard("Android")
                }
            }
        }
    }
}

@Composable
fun BusinessCard(name: String, modifier: Modifier = Modifier) {
    Box(modifier = Modifier.background(Color.Gray)) {

        Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.padding(16.dp)){
            Spacer(modifier = Modifier.padding(100.dp))
            Image(painter = painterResource(id = R.drawable.android_logo),
                contentDescription = null,
                modifier = Modifier
                    .height(100.dp)
                    .background(Color.DarkGray))
            Text(
                text = "Matheus Alves",
                modifier = modifier,
                fontSize = 38.sp,
                fontFamily = FontFamily.Serif
            )
            Text(
                text = "Android Developer Extraordinaire",
                modifier = modifier,
                color = Color(0xFF3ddc84),
                fontFamily = FontFamily.Monospace
            )
            Box(modifier = Modifier.padding(0.dp,100.dp,0.dp,0.dp)) {
                Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.padding(10.dp)){
                    Row {
                        Icon(Icons.Rounded.Phone, contentDescription = "Phone Icon",  modifier = Modifier.padding(25.dp,0.dp,25.dp,0.dp), tint = Color.DarkGray)
                        Text(
                            text = "+1 222 (33) 4444",
                            modifier = Modifier.fillMaxWidth()
                        )
                    }
                    Row {
                        Icon(Icons.Rounded.Share, contentDescription = "Share Icon", modifier = Modifier.padding(25.dp,0.dp,25.dp,0.dp), tint = Color.DarkGray)
                        Text(
                            text = "@MatheusAngola",
                            modifier = Modifier.fillMaxWidth()
                        )
                    }
                    Row {
                        Icon(Icons.Rounded.Email, contentDescription = "Email Icon", modifier = Modifier.padding(25.dp,0.dp,25.dp,0.dp), tint = Color.DarkGray)
                        Text(
                            text = "matheusangola97@gmail.com",
                            modifier = Modifier.fillMaxWidth()
                        )
                    }

                }
            }
        }
    }




}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardTheme {
        BusinessCard("Android")
    }
}