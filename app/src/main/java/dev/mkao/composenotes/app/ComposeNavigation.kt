package dev.mkao.composenotes.app

import android.view.Surface
import androidx.compose.animation.Crossfade
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import dev.mkao.composenotes.router.NavigationRouter
import dev.mkao.composenotes.router.NavigationScreens
import dev.mkao.composenotes.screens.AlertDialogScreen
import dev.mkao.composenotes.screens.BottonScreen
import dev.mkao.composenotes.screens.NavigationScreen
import dev.mkao.composenotes.screens.ProgressIndicatorScreen
import dev.mkao.composenotes.screens.TextFieldScreen
import dev.mkao.composenotes.screens.TextScreen

@Composable
fun ComposeNavigation(){
    Surface(Color = MaterialTheme.colors.background){
       Crossfade(targetState = NavigationRouter.currentScreen) {screenSate ->
            when(screenState.value){
                is NavigationScreens.Navigation -> NavigationScreen()
                is NavigationScreens.AlertDialog -> AlertDialogScreen()
                is NavigationScreens.Buttons -> BottonScreen()
                is NavigationScreens.ProgressIndicator -> ProgressIndicatorScreen()
                is NavigationScreens.Text -> TextScreen()
                is NavigationScreens.TextField -> TextFieldScreen()
            }
            
        }
        
    }
}

