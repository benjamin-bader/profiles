package com.bendb.profiles.ui

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bendb.profiles.ProfilesApplication
import com.bendb.profiles.R
import javax.inject.Inject

class ProfilesListFragment : Fragment() {
    @Inject
    lateinit var db: SQLiteOpenHelper

    override fun onAttach(context: Context) {
        super.onAttach(context)

        ProfilesApplication.getComponent(context).inject(this)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_profiles_list, container, false)

        val recycler = view.findViewById(R.id.recycler_view) as RecyclerView
        recycler.addItemDecoration(DividerItemDecoration(activity, DividerItemDecoration.VERTICAL_LIST, 0f, false))

        return view
    }
}