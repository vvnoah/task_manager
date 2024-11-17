package com.taskmanager.vvnoah.ui.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Footer() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(5.dp, 5.dp)
            .border(width = 2.dp, color = Black)
            .padding(0.dp, 5.dp, 10.dp, 5.dp),
        contentAlignment = Alignment.CenterEnd
    ) {
        Row{
            TextButton(
                onClick = { newTask() }
            ) {
                Text("New Task")
            }
        }
    }
}

fun newTask() {
    println("new task clicked")
}
