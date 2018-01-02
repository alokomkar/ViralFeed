package com.sortedqueue.viral.data.db

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Delete
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy.REPLACE

/**
 * Created by Alok on 02/01/18.
 */
@Dao
interface BaseDBHelper {

    @Insert( onConflict = REPLACE )
    fun <T> insert(t : T )

    @Delete
    fun <T> delete( t : T )

}