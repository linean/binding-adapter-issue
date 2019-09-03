package com.example.dynamicfeature

import android.view.View
import androidx.databinding.BindingAdapter

object BindingAdapters {
    @JvmStatic
    @BindingAdapter("app:adapterFromDynamicFeature")
    fun View.adapterFromDynamicFeature(value: Boolean) {

    }
}
