package dev.mkao.composenotes

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import dev.mkao.composenotes.app.ComposeNavigation

class MainActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_ComposeNotes)
        super.onCreate(savedInstanceState)
        setContent {
            ComposeNavigation()
        }
    }
}