package com.example.itask.model

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface TaskDao {

//    The R in CRUD which stands for Read
    @Query("SELECT * FROM Tasks ORDER BY target_date DESC")
    fun getAllTasks(): Flow<List<TaskEntity>>

//    The C in CRUD which stands for Create
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTasks(task: TaskEntity)

//    The U in CRUD which stands for Update
    @Update
    suspend fun updateTasks(task : TaskEntity)

//    The D in CRUD which stands for Delete
    @Delete
    suspend fun deleteATask(task: TaskEntity)

    @Query("DELETE FROM Tasks")
    suspend fun deleteAllTasks()



}