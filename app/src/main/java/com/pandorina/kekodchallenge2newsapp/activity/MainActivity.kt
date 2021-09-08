package com.pandorina.kekodchallenge2newsapp.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.pandorina.kekodchallenge2newsapp.R
import com.pandorina.kekodchallenge2newsapp.fragment.NewsFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().replace(R.id.container, NewsFragment()).commit()
    }
}