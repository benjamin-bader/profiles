package com.bendb.profiles.model

import android.content.ContentValues
import android.database.Cursor
import com.bendb.profiles.data.db.getInt
import com.bendb.profiles.data.db.getString

data class Profile(
        val id: Int?,
        val name: String,
        val fences: List<LocationTrigger>,
        val effects: List<Effect>) {

    companion object {

    }
}
