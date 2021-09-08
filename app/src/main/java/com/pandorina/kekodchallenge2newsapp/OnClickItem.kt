package com.pandorina.kekodchallenge2newsapp

import android.widget.ImageView
import android.widget.TextView
import com.pandorina.kekodchallenge2newsapp.model.News

interface OnClickItem{
    fun onClickNewsItem(news: News, image: ImageView, category: TextView, title: TextView, time: TextView)
}