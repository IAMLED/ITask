package com.example.itask.backend

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.itask.model.TaskEntity
import com.example.itask.model.TaskRepo
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch


class TasksViewModel(private val repo: TaskRepo): ViewModel() {

    val tasks = repo.getAllTasks.stateIn(
        viewModelScope,
        SharingStarted.WhileSubscribed(5000),
        emptyList()
    )

    fun addTasks(name: String, task_desc: String, status: String, task_target: Long){
        viewModelScope.launch {
            repo.addTask(TaskEntity(task_name = name, tasks_desc = task_desc, status = status, target_date = task_target ))
        }
    }

    fun updateTasks(task: TaskEntity){
        viewModelScope.launch {
            repo.updateTask(task)
        }
    }

    fun deleteOneTask(task: TaskEntity){
        viewModelScope.launch {
            repo.deleteSingleTask(task)
        }
    }

    fun clearTasks(task: TaskEntity){
        viewModelScope.launch {
            repo.deleteAllTasks(task)
        }
    }
}