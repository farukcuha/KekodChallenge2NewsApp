package com.pandorina.kekodchallenge2newsapp.activity

import android.content.Context
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.pandorina.kekodchallenge2newsapp.R
import com.pandorina.kekodchallenge2newsapp.fragment.IntroFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().add(R.id.fragment_container, IntroFragment()).commit()

        val newsPreferences = applicationContext.getSharedPreferences("news_preferences", Context.MODE_PRIVATE)
        val editor = newsPreferences.edit()

        if (!newsPreferences.getBoolean("was_dialog_showed", false)){
            Handler(mainLooper).postDelayed({
                if (!isFinishing) {
                    notifyDialog().show()
                    editor.putBoolean("was_dialog_showed", true)
                    editor.apply()
                }
            }, 20000)
        }
    }

    private fun notifyDialog(): AlertDialog{
        return AlertDialog.Builder(this).apply {
            setTitle("Bilgilendirme")
            setMessage("Widgetimize de göz atmak isteyebilirsiniz...")
            setNeutralButton("TAMAM") { dialog, which ->
                dialog.dismiss()
            }
        }.create()
    }
}