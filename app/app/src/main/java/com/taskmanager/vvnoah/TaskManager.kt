package com.taskmanager.vvnoah

import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.taskmanager.vvnoah.ui.components.FooterComponent
import com.taskmanager.vvnoah.ui.components.HeaderComponent
import com.taskmanager.vvnoah.ui.components.TaskListComponent
import kotlinx.serialization.Serializable

@Serializable
object TaskList

@Composable
fun TaskManager(
    navController: NavHostController = rememberNavController()
){
    Scaffold(
        topBar = { HeaderComponent() },
        bottomBar = { FooterComponent() },
        modifier = Modifier
            .windowInsetsPadding(WindowInsets.statusBars)
            .windowInsetsPadding(WindowInsets.navigationBars)
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = TaskList,
            modifier = Modifier.fillMaxSize().padding(innerPadding)
        ){
            composable<TaskList> {
                TaskListComponent()
            }
        }
    }
}