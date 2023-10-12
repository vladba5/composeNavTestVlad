package com.example.composenavtestvlad

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.composenavtestvlad.one.ScreenOne
import com.example.composenavtestvlad.two.ScreenTwo
import com.example.composenavtestvlad.ui.theme.ComposeNavTestVladTheme

class MainActivity : ComponentActivity() {

    companion object {
        const val NAME_ARGS = "NAME_ARGS"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeNavTestVladTheme {
                val navController = rememberNavController()
                NavHost(
                    navController = navController,
                    startDestination = "screen1"
                ) {
                    composable("screen1") { entry ->
                        ScreenOne() {
                            val text = entry.savedStateHandle.get<String>(NAME_ARGS)
                            //add text as args
                            Log.d("ptt", text.toString())
                            navController.navigate("screen2")
                        }
                    }
                    composable("screen2") {
                        ScreenTwo() {
                            navController.previousBackStackEntry
                                ?.savedStateHandle
                                ?.set(NAME_ARGS, "vlad")
                            navController.popBackStack("screen1", false)
                        }
                    }
                }
            }
        }
    }
}