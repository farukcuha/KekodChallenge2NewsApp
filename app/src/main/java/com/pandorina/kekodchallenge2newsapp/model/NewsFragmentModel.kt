package com.pandorina.kekodchallenge2newsapp.model

import androidx.annotation.IdRes
import androidx.fragment.app.Fragment

data class NewsFragmentModel(
    @IdRes val id: Int,
    val fragment: Fragment,
    val news: News)
