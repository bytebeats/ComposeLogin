package com.example.androiddevchallenge

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.darkColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.ui.theme.BloomTheme
import com.example.androiddevchallenge.ui.theme.welcomeBg
import com.example.androiddevchallenge.ui.theme.welcomeIllios

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BloomTheme {
                Welcome()
            }
        }
    }
}

// Start building your app here!
@Composable
fun Welcome() {
    Surface(color = MaterialTheme.colors.primary) {
        Box(modifier = Modifier.fillMaxSize()) {
            Image(
                painter = painterResource(id = welcomeBg(isSystemInDarkTheme())),
                contentDescription = "background",
                modifier = Modifier.background(MaterialTheme.colors.primary)
            )
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Top,
            ) {
                Image(
                    painter = painterResource(id = welcomeIllios(isSystemInDarkTheme())),
                    contentDescription = "illos",
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                        .padding(start = 88.dp, top = 48.dp),
                )
                Spacer(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(48.dp)
                )
                Text(text = stringResource(id = R.string.bloom))
                Text(text = stringResource(id = R.string.bloom_brief))
                Spacer(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(40.dp)
                )
                Button(onClick = { /*TODO*/ }) {
                    Text(text = stringResource(id = R.string.create_account))
                }

                Button(onClick = { /*TODO*/ }) {
                    Text(text = stringResource(id = R.string.login))
                }
            }
        }
    }
}

@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun WelcomeLightPreview() {
    BloomTheme {
        Welcome()
    }
}

@Preview("Dark Theme", widthDp = 360, heightDp = 640)
@Composable
fun WelcomeDarkPreview() {
    BloomTheme(darkTheme = true) {
        Welcome()
    }
}