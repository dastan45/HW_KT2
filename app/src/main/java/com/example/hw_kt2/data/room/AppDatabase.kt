package com.example.hw_kt2.data.room

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [ShopItemDBModel::class], version = 1, exportSchema = false )
abstract class AppDatabase : RoomDatabase(){
    abstract fun shopListDao(): ShopDao
}