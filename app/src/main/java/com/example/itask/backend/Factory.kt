package com.example.itask.backend

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.itask.model.TaskRepo
import kotlin.jvm.java

class Factory(private val repo: TaskRepo): ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return if (modelClass.isAssignableFrom(TasksViewModel::class.java)){
            TasksViewModel(repo) as T
        }else{
            throw IllegalArgumentException("Unknown ViewModel Class")
        }
    }
}