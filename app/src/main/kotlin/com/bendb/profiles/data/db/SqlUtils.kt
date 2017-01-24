package com.bendb.profiles.data.db

import android.database.Cursor
import android.database.sqlite.SQLiteDatabase

inline fun <T> SQLiteDatabase.transact(fn: SQLiteDatabase.() -> T): T {
    beginTransaction()
    try {
        return fn().apply {
            setTransactionSuccessful()
        }
    } finally {
        endTransaction()
    }
}

fun Cursor.getInt(name: String) = getInt(getColumnIndexOrThrow(name))
fun Cursor.getLong(name: String) = getLong(getColumnIndexOrThrow(name))
fun Cursor.getFloat(name: String) = getFloat(getColumnIndexOrThrow(name))
fun Cursor.getDouble(name: String) = getDouble(getColumnIndexOrThrow(name))
fun Cursor.getString(name: String) = getString(getColumnIndexOrThrow(name))