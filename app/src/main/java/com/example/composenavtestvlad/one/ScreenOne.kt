package com.example.composenavtestvlad.one

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScreenOne(onClick: () -> Unit) {
    Scaffold() { paddingValues ->
        Column(modifier = Modifier.padding(paddingValues)) {
            Text(text = "one", modifier = Modifier.clickable { onClick() })
            Text(text = "one")
            Text(text = "one")
        }
    }
}

@Preview
@Composable
fun previewScreenOne(){
    ScreenOne() {}
}