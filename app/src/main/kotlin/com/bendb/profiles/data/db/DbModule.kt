package com.bendb.profiles.data.db

import android.content.Context
import android.database.sqlite.SQLiteOpenHelper
import com.bendb.profiles.App
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DbModule {
    @Provides
    @Singleton
    fun provideSQLite(@App context: Context): SQLiteOpenHelper {
        return DbOpenHelper(context)
    }
}