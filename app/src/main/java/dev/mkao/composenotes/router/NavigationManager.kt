package dev.mkao.composenotes.router

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf

sealed class NavigationScreens {
    object Navigation:NavigationScreens()
    object Text : NavigationScreens()
    object TextField:NavigationScreens()
    object Buttons:NavigationScreens()
    object ProgressIndicator:NavigationScreens()
    object AlertDialog:NavigationScreens()
}
object NavigationRouter{
    val currentScreen : MutableState<NavigationScreens> = mutableStateOf(NavigationScreens.Navigation)
    fun navigateTo(destination: NavigationScreens){
       currentScreen.value =destination
    }
}