package com.pandorina.kekodchallenge2newsapp.activity

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import com.pandorina.kekodchallenge2newsapp.R
import com.pandorina.kekodchallenge2newsapp.databinding.ActivityIntroBinding

class IntroActivity : AppCompatActivity(R.layout.activity_intro) {
    lateinit var binding: ActivityIntroBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIntroBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val birdMoveAnim = AnimationUtils.loadAnimation(applicationContext, R.anim.left_to_mid)
        val birdFadeAnim = AnimationUtils.loadAnimation(applicationContext, R.anim.fade_out)
        val logoAnim = AnimationUtils.loadAnimation(applicationContext, R.anim.fade_in)

        binding.bird.startAnimation(birdMoveAnim)

        logoAnim.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationStart(animation: Animation?) {
                return
            }

            override fun onAnimationEnd(animation: Animation?) {
                Handler(mainLooper).postDelayed({
                    Intent(applicationContext, MainActivity::class.java).let {
                        it.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
                        startActivity(it)
                    }
                }, 2000)
            }

            override fun onAnimationRepeat(animation: Animation?) {
                return
            }
        })

        birdMoveAnim.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationStart(animation: Animation?) {
                return
            }

            override fun onAnimationEnd(animation: Animation?) {
                binding.bird.startAnimation(birdFadeAnim)
                binding.logo.startAnimation(logoAnim)
                binding.logo.isVisible = true
            }

            override fun onAnimationRepeat(animation: Animation?) {
                return
            }
        })

    }

}