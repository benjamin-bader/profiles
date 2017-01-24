package com.bendb.profiles.data

import android.content.ContentProvider
import android.content.ContentValues
import android.database.Cursor
import android.net.Uri
import com.bendb.profiles.data.db.DbOpenHelper

class ProfilesContentProvider : ContentProvider() {
    private val openHelper: DbOpenHelper by lazy {
        DbOpenHelper(context)
    }

    override fun onCreate(): Boolean {
        return true
    }

    override fun getType(uri: Uri): String {
        TODO()
    }

    override fun insert(uri: Uri, values: ContentValues?): Uri {
        TODO()
    }

    override fun query(uri: Uri, projection: Array<out String>?, selection: String?, selectionArgs: Array<out String>?, sortOrder: String?): Cursor {
        TODO()
    }

    override fun update(uri: Uri, values: ContentValues, selection: String?, selectionArgs: Array<out String>?): Int {
        TODO()
    }

    override fun delete(uri: Uri, selection: String?, selectionArgs: Array<out String>?): Int {
        TODO()
    }
}