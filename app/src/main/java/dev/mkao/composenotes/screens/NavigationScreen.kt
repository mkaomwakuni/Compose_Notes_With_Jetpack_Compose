package dev.mkao.composenotes.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import dev.mkao.composenotes.R
import dev.mkao.composenotes.router.NavigationRouter
import dev.mkao.composenotes.router.NavigationScreens

@Composable
fun NavigationScreen () {
Surface (
    color = Color.White,
    modifier = Modifier.fillMaxSize()
){
    Column(verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally) {
        NavigationButton(stringResource(id = R.string.text), NavigationScreens.Text)
        NavigationButton(stringResource(id = R.string.text_field), NavigationScreens.TextField)
        NavigationButton(stringResource (id = R.string.buttons),NavigationScreens.Buttons)
        NavigationButton(stringResource (id = R.string.progress_circle),NavigationScreens.ProgressIndicator)
        NavigationButton(stringResource(id = R.string.alertdialog),NavigationScreens.AlertDialog)

    }
 }
}

@Composable
fun NavigationButton(text: String, navigationScreens:NavigationScreens) {
    Button(modifier = Modifier
        .fillMaxSize()
        .padding(start = 16.dp, end = 16.dp, top = 16.dp),
    shape = RoundedCornerShape(4.dp),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = colorResource(id = R.color.colorPrimary)

        ), onClick = {
            NavigationRouter.navigateTo(navigationScreens) }
    ) {
        Text(text = text,
        color = Color.White
        )

    }
}
