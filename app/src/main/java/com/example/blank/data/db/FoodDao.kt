package com.example.blank.data.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.blank.models.Result

@Dao
interface FoodDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertOrUpdate(resultFood: Result): Long

    @Query("SELECT * FROM foods")
    fun getAllFoods(): LiveData<List<Result>>

    @Delete
    suspend fun deleteFood(food: Result)
}