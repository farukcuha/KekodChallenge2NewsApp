package com.pandorina.kekodchallenge2newsapp.fragment

import android.os.Bundle
import android.view.View
import com.pandorina.kekodchallenge2newsapp.util.OnClickItem
import com.pandorina.kekodchallenge2newsapp.util.Constant
import com.pandorina.kekodchallenge2newsapp.databinding.FragmentBigNewsItemBinding

class BigNewsItemFragment(private val onClickItem: OnClickItem) :
    BaseFragment<FragmentBigNewsItemBinding>(
        FragmentBigNewsItemBinding::inflate,
        Constant.ARG_NEWS) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        argumentResult?.let { news ->
            binding.news = news
            binding.root.setOnClickListener {
                onClickItem.onClickNewsItem(
                    news,
                    binding.bigImage,
                    binding.bigCategory,
                    binding.bigTitle,
                    binding.bigTime
                )
            }
        }
    }

}