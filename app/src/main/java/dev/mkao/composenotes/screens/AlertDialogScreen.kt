package dev.mkao.composenotes.screens

import androidx.compose.runtime.Composable
import dev.mkao.composenotes.router.BackclickManager

@Composable
fun AlertDialogScreen () {
 AlertDialogshow()
 BackclickManager{
   NavigationScreen()
  }
}

@Composable
fun AlertDialogshow() {
    TODO("Not yet implemented")
}
