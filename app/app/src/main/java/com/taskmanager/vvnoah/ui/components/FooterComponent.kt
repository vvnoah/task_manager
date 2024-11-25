package com.taskmanager.vvnoah.ui.components

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.unit.dp

@Composable
fun FooterComponent() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(5.dp, 5.dp),
        horizontalArrangement = Arrangement.End
    ) {
        Box(
            modifier = Modifier
                .border(width = 2.dp, color = Black)
                .clickable { newTask() }
                .padding(10.dp, 5.dp)
        ){
            Text("new task")
        }
    }
}

fun newTask() {
    println("new task clicked")
}
