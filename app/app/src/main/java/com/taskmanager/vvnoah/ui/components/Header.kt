package com.taskmanager.vvnoah.ui.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Header() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(5.dp, 5.dp)
            .border(width = 2.dp, color = Black)
            .padding(0.dp, 5.dp, 10.dp, 5.dp),
        contentAlignment = Alignment.Center
    ) {
        Text("Task Board", fontSize = 30.sp, fontWeight = FontWeight.Bold)
    }
}