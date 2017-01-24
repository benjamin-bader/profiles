package com.bendb.profiles

import android.content.Context
import com.bendb.profiles.data.db.DbModule
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(
        includes = arrayOf(DbModule::class)
)
class AppModule(private val app: ProfilesApplication) {
    @Provides
    @Singleton
    @App
    fun provideContext(): Context = app.applicationContext


}