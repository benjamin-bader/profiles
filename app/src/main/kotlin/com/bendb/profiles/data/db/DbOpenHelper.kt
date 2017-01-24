package com.bendb.profiles.data.db

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DbOpenHelper(context: Context) : SQLiteOpenHelper(context, NAME, null, VERSION) {
    companion object {
        private const val NAME = "profiles.db"
        private const val VERSION = 1
    }

    override fun onCreate(db: SQLiteDatabase) {
        onUpgrade(db, 0, VERSION)
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        if (oldVersion < 1) {
            db.transact {
                execSQL("""
                    CREATE TABLE ${DbContract.Profile.TABLE_NAME} (
                        ${DbContract.Profile.COLUMN_ID} INTEGER PRIMARY KEY AUTOINCREMENT,
                        ${DbContract.Profile.COLUMN_NAME} TEXT
                    )
                """)

                execSQL("""
                    CREATE TABLE ${DbContract.Fence.TABLE_NAME} (
                        ${DbContract.Fence.COLUMN_ID} INTEGER PRIMARY KEY AUTOINCREMENT,
                        ${DbContract.Fence.COLUMN_PROFILE_ID} INTEGER NOT NULL,
                        ${DbContract.Fence.COLUMN_LATITUDE} REAL,
                        ${DbContract.Fence.COLUMN_LONGITUDE} REAL,
                        ${DbContract.Fence.COLUMN_RADIUS_METERS} INTEGER
                    )
                """)

                execSQL("""
                    CREATE TABLE profiles_to_
                """)
            }
        }
    }

    override fun onDowngrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        super.onDowngrade(db, oldVersion, newVersion)
    }
}