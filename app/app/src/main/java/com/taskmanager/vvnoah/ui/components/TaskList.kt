package com.taskmanager.vvnoah.ui.components

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.rounded.Delete
import androidx.compose.material.icons.rounded.Edit
import androidx.compose.material.icons.rounded.MoreVert
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TaskList(
    modifier: Modifier = Modifier
) {
    Column(
        Modifier.padding(5.dp, 0.dp)
    ) {
        TaskListItem(false, "Task 1")
        TaskListItem(false, "Task 2")
        TaskListItem(true, "Task 3")
    }
}

@Composable
fun TaskListItem (
    completed: Boolean,
    title: String,
    modifier: Modifier = Modifier
) {
    var checked by remember { mutableStateOf(completed) }
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth(1f)
            .padding(0.dp, 5.dp)
            .clickable { viewTask() }
            .border(width = 2.dp, color = Black)
            .padding(0.dp, 5.dp, 10.dp, 5.dp)

    ) {
        Checkbox(
            checked = checked,
            onCheckedChange = { checked = it }
        )
        Column(
            modifier = Modifier.fillMaxWidth(0.6f)
        ) {
            Text(
                text = title,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )
        }
        Column(
            modifier = Modifier
        ) {
            Row{
                IconButton(
                    onClick = { removeTask() }
                ) {
                    Icon(
                        Icons.Rounded.Delete,
                        contentDescription = "Delete Task"
                    )
                }
                IconButton(
                    onClick = { editTask() }
                ) {
                    Icon(
                        Icons.Rounded.Edit,
                        contentDescription = "Edit Task"
                    )
                }
                IconButton(
                    onClick = { viewTask() }
                ) {
                    Icon(
                        Icons.Rounded.MoreVert,

                        contentDescription = "Edit Task"
                    )
                }
            }
        }
    }
}

fun viewTask() {
    println("view task clicked")
}

fun editTask() {
    println("edit task clicked")
}

fun removeTask() {
    println("delete task clicked")
}
