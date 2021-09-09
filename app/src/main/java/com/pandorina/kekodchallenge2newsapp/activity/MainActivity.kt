package com.pandorina.kekodchallenge2newsapp.activity

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
        supportFragmentManager.beginTransaction().add(R.id.container, IntroFragment()).commit()

        val widgetNotifyDialog = AlertDialog.Builder(this).apply {
            setTitle("Bilgilendirme")
            setMessage("Widgetimize de göz atmak isteyebilirsiniz...")
            setNeutralButton("TAMAM") { dialog, which ->
                dialog.dismiss()
            }
            create()
        }

        Handler(mainLooper).postDelayed({
            if (!isFinishing) {
                widgetNotifyDialog.show()
            }
        }, 20000)
    }
}