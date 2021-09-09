package com.pandorina.kekodchallenge2newsapp.util

import android.widget.ImageView
import androidx.core.view.isVisible
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions

@BindingAdapter("app:loadImage")
fun loadImage(view: ImageView, url: String?) {
    Glide.with(view)
        .load(url)
        .transition(DrawableTransitionOptions.withCrossFade())
        .into(view)
}

@BindingAdapter("app:checkVisibility")
fun checkVisibility(view: ImageView, item: String?) {
    item?.let {
        view.isVisible = true
    } ?: run {
        view.isVisible = false
    }
}