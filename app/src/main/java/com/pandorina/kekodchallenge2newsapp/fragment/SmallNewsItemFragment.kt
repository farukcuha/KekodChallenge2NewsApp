package com.pandorina.kekodchallenge2newsapp.fragment

import android.os.Bundle
import android.view.View
import com.pandorina.kekodchallenge2newsapp.OnClickItem
import com.pandorina.kekodchallenge2newsapp.util.Constant
import com.pandorina.kekodchallenge2newsapp.databinding.FragmentSmallNewsItemBinding


class SmallNewsItemFragment(private val onClickItem: OnClickItem) :
    BaseFragment<FragmentSmallNewsItemBinding>(
        FragmentSmallNewsItemBinding::inflate,
        Constant.ARG_NEWS
    ) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        argumentResult?.let { news ->
            binding.news = news
            binding.root.setOnClickListener {
                onClickItem.onClickNewsItem(
                    news,
                    binding.smallImage,
                    binding.smallCategory,
                    binding.smallTitle,
                    binding.smallTime
                )
            }
        }
    }


}
