package com.sortedqueue.viral.data.db

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.sortedqueue.viral.data.db.model.User
import com.sortedqueue.viral.data.db.model.UserDao

/**
 * Created by Alok on 02/01/18.
 */

@Database(entities = arrayOf(User::class), version = 1)
abstract class AppDBHelper : RoomDatabase() {

    abstract fun getUserDao() : UserDao

}