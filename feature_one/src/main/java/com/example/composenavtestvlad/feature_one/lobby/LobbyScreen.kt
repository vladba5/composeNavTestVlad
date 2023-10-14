package com.example.composenavtestvlad.feature_one.lobby

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun LobbyScreen() {
    Scaffold() { paddingValues ->
        Column(modifier = Modifier.padding(paddingValues)) {
            Text("lobby")
        }
    }
}


@Preview
@Composable
fun PreviewLobbyScreen(){
    LobbyScreen()
}