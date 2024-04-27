package com.example.AGUNGUTS

import android.content.Context
import android.view.View
import android.widget.ProgressBar
import androidx.recyclerview.widget.RecyclerView
import com.example.AGUNGUTS.adapters.UserListAdapter
import com.example.AGUNGUTS.retrofit.ItemsItem

object Util {
    fun showLoading(isLoading: Boolean, progressBar: ProgressBar) {
        if (isLoading) {
            progressBar.visibility = View.VISIBLE
        } else {
            progressBar.visibility = View.GONE
        }
    }

    fun setUserData(User: List<ItemsItem>, recyclerView: RecyclerView, context: Context) {
        val adapter = UserListAdapter(User)
        recyclerView.adapter = adapter
    }
}