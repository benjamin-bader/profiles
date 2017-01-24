package com.bendb.profiles

import android.app.Application
import android.content.Context
import com.crashlytics.android.Crashlytics
import io.fabric.sdk.android.Fabric
import timber.log.Timber

class ProfilesApplication : Application() {
    companion object {
        fun getComponent(context: Context): AppComponent {
            val app = context.applicationContext as ProfilesApplication
            return app.component
        }
    }

    lateinit var component: AppComponent

    override fun onCreate() {
        super.onCreate()

        Fabric.with(this, Crashlytics())

        component = DaggerAppComponent.builder()
                .appModule(AppModule(this))
                .build()

        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }
}