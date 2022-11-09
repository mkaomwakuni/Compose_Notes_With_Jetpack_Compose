package dev.mkao.composenotes.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import dev.mkao.composenotes.router.BackclickManager
import dev.mkao.composenotes.router.NavigationRouter
import dev.mkao.composenotes.router.NavigationScreens

@Composable
fun TextScreen () {
    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement =  Arrangement.Center
    ){
        AddedText()

    }
    BackclickManager {
        NavigationRouter.navigateTo(NavigationScreens.Navigation)
    }
}

@Composable
fun AddedText() {
    TODO("Not yet implemented")
}
