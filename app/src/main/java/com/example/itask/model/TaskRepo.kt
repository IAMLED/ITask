package com.example.itask.model

import kotlinx.coroutines.flow.Flow


class TaskRepo(private val dao: TaskDao) {

    val getAllTasks: Flow<List<TaskEntity>> = dao.getAllTasks()

    suspend fun addTask(task : TaskEntity){
        dao.insertTasks(task)
    }

    suspend fun updateTask(task: TaskEntity){
        dao.updateTasks(task)
    }

    suspend fun deleteSingleTask(task: TaskEntity){
        dao.deleteATask(task)
    }

    suspend fun deleteAllTasks(task: TaskEntity){
        dao.deleteAllTasks()
    }



}