package com.vertexcode.luxuryeye.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.vertexcode.luxuryeye.presentation.ui.theme.PrimaryColor


@Composable
fun CustomButton(
    text : String,
    onClick: () -> Unit
){

    Button(
        onClick = {
            onClick()
        },
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = PrimaryColor
        ),
        shape = CircleShape
    ) {
        Text(
            text = text,
            color = Color.White
        )
    }

}