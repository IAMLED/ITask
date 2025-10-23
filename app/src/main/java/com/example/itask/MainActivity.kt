package com.example.itask

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.itask.backend.Factory
import com.example.itask.backend.TasksViewModel
import com.example.itask.model.TaskDatabase
import com.example.itask.model.TaskRepo
import com.example.itask.ui.theme.ITaskTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val database = Room.databaseBuilder(
            applicationContext,
            TaskDatabase::class.java,
            "task_db"
        ).build()

        val repository = TaskRepo(database.taskDao())
        val taskFactory = Factory(repository)


        setContent {
            ITaskTheme {
                val taskViewModel: TasksViewModel = viewModel(factory = taskFactory)

            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {

}