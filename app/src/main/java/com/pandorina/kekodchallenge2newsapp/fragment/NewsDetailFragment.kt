package com.pandorina.kekodchallenge2newsapp.fragment

import android.content.Intent
import android.os.Bundle
import android.view.*
import androidx.core.view.ViewCompat
import androidx.transition.TransitionInflater
import com.pandorina.kekodchallenge2newsapp.R
import com.pandorina.kekodchallenge2newsapp.databinding.FragmentNewsDetailBinding
import com.pandorina.kekodchallenge2newsapp.util.Constant


class NewsDetailFragment :
    BaseFragment<FragmentNewsDetailBinding>(
    FragmentNewsDetailBinding::inflate,
    Constant.ARG_NEWS){
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.fragment = this
        binding.news = argumentResult

        ViewCompat.setTransitionName(binding.detailCategory, Constant.TO_SHARED_CATEGORY)
        ViewCompat.setTransitionName(binding.detailImage, Constant.TO_SHARED_IMAGE)
        ViewCompat.setTransitionName(binding.detailTitle, Constant.TO_SHARED_TITLE)
        ViewCompat.setTransitionName(binding.detailTime, Constant.TO_SHARED_TIME)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        sharedElementEnterTransition = TransitionInflater.from(requireContext())
            .inflateTransition(R.transition.shared_view)
    }

    fun onClickBack(){
        parentFragmentManager.popBackStack()
    }

    fun onClickShare(){
        Intent().apply {
            type = "text/plain"
            putExtra(Intent.EXTRA_TEXT, argumentResult?.resource)
            startActivity(this)
        }
    }
}