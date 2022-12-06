package com.geektech.a6m4.ui

import android.view.LayoutInflater
import androidx.lifecycle.ViewModelProvider
import com.geektech.a6m4.base.BaseFragment
import com.geektech.a6m4.base.BaseViewModel
import com.geektech.a6m4.databinding.FragmentSecondBinding


class SecondFragment : BaseFragment<FragmentSecondBinding, BaseViewModel>() {

    private lateinit var viewModel: MainViewModel

    override fun inflateViewBinding(inflater: LayoutInflater): FragmentSecondBinding {
        return FragmentSecondBinding.inflate(layoutInflater)
    }
    override fun initViewModel() {
        viewModel = ViewModelProvider(requireActivity())[MainViewModel::class.java]
    }
    override fun initView() {
        viewModel.listCounter.observe(viewLifecycleOwner) {
            binding.tvCounter.text = it.toString()
        }
    }
}