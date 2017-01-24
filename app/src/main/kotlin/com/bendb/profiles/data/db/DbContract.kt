package com.bendb.profiles.data.db

import android.provider.BaseColumns._COUNT
import android.provider.BaseColumns._ID


object DbContract {
    object Profile {
        const val TABLE_NAME = "profiles"

        const val COLUMN_ID = _ID
        const val COLUMN_COUNT = _COUNT // pseudo-column
        const val COLUMN_NAME = "name"
    }

    object Fence {
        const val TABLE_NAME = "fences"

        const val COLUMN_ID = _ID
        const val COLUMN_COUNT = _COUNT

        const val COLUMN_PROFILE_ID = "profile_id"
        const val COLUMN_LATITUDE = "lat"
        const val COLUMN_LONGITUDE = "long"
        const val COLUMN_RADIUS_METERS = "radius_meters"
    }
}