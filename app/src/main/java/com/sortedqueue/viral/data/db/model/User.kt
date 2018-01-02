package com.sortedqueue.viral.data.db.model

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

/**
 * Created by Alok on 02/01/18.
 */

@Entity
data class User( @PrimaryKey
                 var userId : String = "",
                 var userName : String = "",
                 var userImage : String = "",
                 var userEmail : String = "" ) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as User

        if (userId != other.userId) return false

        return true
    }

    override fun hashCode(): Int {
        return userId.hashCode()
    }

    override fun toString(): String {
        return "User(userId='$userId', userName='$userName', userImage='$userImage', userEmail='$userEmail')"
    }

}