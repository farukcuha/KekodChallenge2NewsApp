package com.pandorina.kekodchallenge2newsapp.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class News(
    val category: String?,
    val time: String?,
    val title: String?,
    val author: String?,
    val mainImage: String?,
    val summary: String?,
    val article1: String?,
    val subImage1: String?,
    val article2: String?,
    val subImage2: String?,
    val article3: String?,
    val resource: String?,
    val divider: Boolean = true
): Parcelable
