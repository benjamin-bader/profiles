package com.bendb.profiles

import com.bendb.profiles.ui.ProfilesListFragment
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(AppModule::class))
interface AppComponent {
    fun inject(activity: MainActivity)
    fun inject(activity: PlacePickerActivity)
    fun inject(fragment: ProfilesListFragment)
}