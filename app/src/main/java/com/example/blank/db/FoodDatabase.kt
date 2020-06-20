package com.example.blank.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.blank.models.NutrientX
import com.example.blank.models.Nutrition

@Database(
    entities = [Result::class, Nutrition::class, NutrientX::class],
    version = 1
)
abstract class FoodDatabase : RoomDatabase() {

    abstract fun getFoodDao(): FoodDao

    companion object {
        @Volatile
        private var instance: FoodDatabase? = null
        private val LOCK = Any()

        operator fun invoke(context: Context) = instance ?: synchronized(LOCK) {
            instance ?: createDatabase(context).also { instance = it }
        }

        private fun createDatabase(context: Context) =
            Room.databaseBuilder(
                context.applicationContext,
                FoodDatabase::class.java,
                "food_db.db"
            ).build()
    }

}