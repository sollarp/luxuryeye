package com.vertexcode.luxuryeye.presentation.user.auth

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.vertexcode.luxuryeye.R
import com.vertexcode.luxuryeye.presentation.ui.theme.BgLight
import com.vertexcode.luxuryeye.presentation.ui.theme.PrimaryColor

@Preview
@Composable
fun Login() {

    val padding = Modifier.height(16.dp)

    val emailAddress = rememberSaveable { mutableStateOf("") }
    val password = rememberSaveable { mutableStateOf("") }

    Column(
        modifier = Modifier
            .verticalScroll(state = rememberScrollState())
            .fillMaxSize()
            .background(color = Color.White)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "Sign In",
            style = TextStyle(
                fontSize = 32.sp,
                fontWeight = FontWeight.Normal
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 32.dp)
        )

        TextField(
            value = emailAddress.value,
            onValueChange = {
                emailAddress.value = it
            },
            placeholder = {
                Text(text = "Email Address")
            },
            colors = TextFieldDefaults.textFieldColors(
                unfocusedIndicatorColor = Color.Transparent,
                focusedIndicatorColor = Color.Transparent,
                backgroundColor = BgLight
            ),
            shape = RoundedCornerShape(4.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 12.dp)
        )


        TextField(
            value = password.value,
            onValueChange = {
                password.value = it
            },
            placeholder = {
                Text(text = "Password")
            },
            colors = TextFieldDefaults.textFieldColors(
                unfocusedIndicatorColor = Color.Transparent,
                focusedIndicatorColor = Color.Transparent,
                backgroundColor = BgLight
            ),
            shape = RoundedCornerShape(4.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 12.dp)
        )

        Spacer(modifier = padding)

        CustomButton(text = "Sig In", onClick = {

        })

        Spacer(modifier = padding)

        Text(
            text = "Forgot Password ? Reset",
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp)
        )

        Spacer(modifier = padding)

        CustomButton(text = "Log In as Guest", onClick = {

        })
        Spacer(modifier = padding)

        CustomButton(text = "Register", onClick = {

        })

        Spacer(modifier = Modifier.height(48.dp))

        ContinueWithCustomButton(
            text = "Continue With Apple",
            image = R.drawable.apple_icon,
            onClick = {}
            )

        Spacer(modifier = padding)

        ContinueWithCustomButton(
            text = "Continue With Google",
            image = R.drawable.google_icon,
            onClick = {}
        )

        Spacer(modifier = padding)

        ContinueWithCustomButton(
            text = "Continue With Facebook",
            image = R.drawable.facebook_icon,
            onClick = {}
        )


    }
}

@Composable
fun ContinueWithCustomButton(
    text: String,
    image: Int,
    onClick: () -> Unit
) {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable {
                onClick()
            }
            .height(50.dp)
            .background(color = BgLight, shape = CircleShape)
            .clip(
                shape = CircleShape
            ),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = image),
            contentDescription = " Icon ",
            modifier = Modifier
                .padding(start = 16.dp)
                .size(32.dp)
        )

        Text(
            text = text,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(end = 32.dp)
        )
    }
}



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