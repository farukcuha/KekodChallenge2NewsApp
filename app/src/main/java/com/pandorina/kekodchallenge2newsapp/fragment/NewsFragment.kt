package com.pandorina.kekodchallenge2newsapp.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.core.view.ViewCompat
import com.pandorina.kekodchallenge2newsapp.OnClickItem
import com.pandorina.kekodchallenge2newsapp.R
import com.pandorina.kekodchallenge2newsapp.util.Constant
import com.pandorina.kekodchallenge2newsapp.databinding.FragmentNewsBinding
import com.pandorina.kekodchallenge2newsapp.model.News
import com.pandorina.kekodchallenge2newsapp.model.NewsFragmentModel
import com.pandorina.kekodchallenge2newsapp.resource.BriefingResources.getBriefingList
import com.pandorina.kekodchallenge2newsapp.resource.SportResources.getTechnologyList
import com.pandorina.kekodchallenge2newsapp.resource.TechnologyResources.getSportList

class NewsFragment : BaseFragment<FragmentNewsBinding>(FragmentNewsBinding::inflate, null),
    OnClickItem {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        inflateNews()
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    private fun inflateNews() {
        for (briefingItem in getBriefingList(this)) {
            addFragment(briefingItem)
        }
        for (technologyItem in getTechnologyList(this)) {
            addFragment(technologyItem)
        }
        for (sportItem in getSportList(this)) {
            addFragment(sportItem)
        }
    }

    private fun addFragment(item: NewsFragmentModel) {
        val fragment = item.fragment
        val bundle = bundleOf(Constant.ARG_NEWS to item.news)
        fragment.arguments = bundle
        parentFragmentManager.beginTransaction().add(item.id, fragment).commit()
    }

    override fun onClickNewsItem(
        news: News,
        image: ImageView,
        category: TextView,
        title: TextView,
        time: TextView
    ) {
        val fragment = NewsDetailFragment()
        val bundle = bundleOf(Constant.ARG_NEWS to news)
        fragment.arguments = bundle

        ViewCompat.setTransitionName(category, Constant.FROM_SHARED_CATEGORY)
        ViewCompat.setTransitionName(image, Constant.FROM_SHARED_IMAGE)
        ViewCompat.setTransitionName(title, Constant.FROM_SHARED_TITLE)
        ViewCompat.setTransitionName(time, Constant.FROM_SHARED_TIME)

        parentFragmentManager.beginTransaction()
            .addSharedElement(image, Constant.TO_SHARED_IMAGE)
            .addSharedElement(category, Constant.FROM_SHARED_CATEGORY)
            .addSharedElement(title, Constant.TO_SHARED_TITLE)
            .addSharedElement(time, Constant.TO_SHARED_TIME)
            .setReorderingAllowed(true)
            .replace(R.id.container, fragment)
            .addToBackStack(null)
            .commit()
    }
}