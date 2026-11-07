package br.ulbra.gamedex

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import br.ulbra.gamedex.ui.AppNavHost
import br.ulbra.gamedex.ui.theme.GameDEXTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GameDEXTheme {
                AppNavHost()
            }
        }
    }
}