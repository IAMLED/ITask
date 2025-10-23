package com.example.itask.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Tasks")
data class TaskEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val task_name: String,
    val tasks_desc: String,
    val status: String,
    val target_date: Long,
    val created_date: Long = System.currentTimeMillis()
)
