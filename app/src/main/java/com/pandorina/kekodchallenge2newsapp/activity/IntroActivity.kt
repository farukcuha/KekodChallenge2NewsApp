package com.pandorina.kekodchallenge2newsapp.activity

import `in`.codeshuffle.typewriterview.TypeWriterListener
import android.content.Intent
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import com.pandorina.kekodchallenge2newsapp.R
import com.pandorina.kekodchallenge2newsapp.databinding.ActivityIntroBinding

class IntroActivity : AppCompatActivity(R.layout.activity_intro), TypeWriterListener {
    lateinit var binding: ActivityIntroBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIntroBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.typeWriter.let {
            it.setTypeWriterListener(this)
            it.setDelay(5)
            it.setWithMusic(true)
            it.animateText("Hoşgeldiniz \n Resimlerin için internet bağlantısı gereklidir.")
        }

    }

    override fun onTypingStart(text: String?) {
        val animation = AnimationUtils.loadAnimation(applicationContext, R.anim.left_to_mid)
        binding.bird.startAnimation(animation)
    }

    override fun onTypingEnd(text: String?) {
        val animation = AnimationUtils.loadAnimation(applicationContext, R.anim.mid_to_right)
        animation.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationStart(animation: Animation?) {
                return
            }

            override fun onAnimationEnd(animation: Animation?) {
                binding.typeWriter.isVisible = false
                binding.bird.isVisible = false
                Intent(applicationContext, MainActivity::class.java).let {
                    it.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
                    startActivity(it)
                }
            }

            override fun onAnimationRepeat(animation: Animation?) {
                return
            }
        })
        binding.bird.startAnimation(animation)
    }

    override fun onCharacterTyped(text: String?, position: Int) {
        return
    }

    override fun onTypingRemoved(text: String?) {
        return
    }
}