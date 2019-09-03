package com.example.bindingadapterissue

import android.view.View
import androidx.databinding.BindingAdapter

object BindingAdapters {
    @JvmStatic
    @BindingAdapter("app:adapterFromCore")
    fun View.adapterFromCore(value: Boolean) {

    }
}
