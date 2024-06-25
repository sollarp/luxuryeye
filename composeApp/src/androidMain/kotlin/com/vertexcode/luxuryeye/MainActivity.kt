package com.vertexcode.luxuryeye

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.vertexcode.luxuryeye.presentation.home.Home
import com.vertexcode.luxuryeye.presentation.user.auth.EmailConfirmation

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Home()
        }
    }
}

@Preview
@Composable
fun AppAndroidPreview() {
    App()
}