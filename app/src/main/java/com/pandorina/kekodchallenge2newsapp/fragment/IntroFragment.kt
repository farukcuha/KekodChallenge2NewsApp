package com.pandorina.kekodchallenge2newsapp.fragment

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.core.view.isVisible
import com.pandorina.kekodchallenge2newsapp.R
import com.pandorina.kekodchallenge2newsapp.databinding.FragmentIntroBinding


class IntroFragment : BaseFragment<FragmentIntroBinding>(FragmentIntroBinding::inflate, null) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val birdMoveAnim = AnimationUtils.loadAnimation(requireContext(), R.anim.left_to_mid)
        val birdFadeAnim = AnimationUtils.loadAnimation(requireContext(), R.anim.fade_out)
        val logoAnim = AnimationUtils.loadAnimation(requireContext(), R.anim.fade_in)

        binding.bird.startAnimation(birdMoveAnim)

        logoAnim.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationStart(animation: Animation?) {
                return
            }

            override fun onAnimationEnd(animation: Animation?) {
                Handler(Looper.getMainLooper()).postDelayed({
                    parentFragmentManager.beginTransaction()
                        .replace(R.id.fragment_container, NewsFragment())
                        .commit()
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