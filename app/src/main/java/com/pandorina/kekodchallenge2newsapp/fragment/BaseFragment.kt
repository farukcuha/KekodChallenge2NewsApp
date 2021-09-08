package com.pandorina.kekodchallenge2newsapp.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding
import com.pandorina.kekodchallenge2newsapp.model.News

abstract class BaseFragment<VB : ViewBinding>(
    private val inflateMethod: (LayoutInflater, ViewGroup?, Boolean) -> VB,
    private val argumentTag: String?
) : Fragment() {

    private var _binding: VB? = null
    val binding get() = _binding!!

    open var argumentResult: News? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = inflateMethod.invoke(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        getNewsArguments()
    }

    private fun getNewsArguments() {
        argumentTag?.let {
            argumentResult = arguments?.get(argumentTag) as News
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}