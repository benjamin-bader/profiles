package com.bendb.profiles.model

interface Effect {
    fun apply()
    fun revert()
}
