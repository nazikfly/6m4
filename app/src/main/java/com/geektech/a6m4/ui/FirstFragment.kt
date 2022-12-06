package com.geektech.a6m4.ui

import android.view.LayoutInflater
import androidx.lifecycle.ViewModelProvider
import com.geektech.a6m4.base.BaseFragment
import com.geektech.a6m4.base.BaseViewModel
import com.geektech.a6m4.databinding.FragmentFirstBinding

class FirstFragment : BaseFragment<FragmentFirstBinding, BaseViewModel>() {

    private lateinit var viewModel: MainViewModel

    override fun inflateViewBinding(inflater: LayoutInflater): FragmentFirstBinding {
        return FragmentFirstBinding.inflate(layoutInflater)
    }
    override fun initViewModel() {
        viewModel = ViewModelProvider(requireActivity())[MainViewModel::class.java]
    }
    override fun initListener() {
        binding.btnPlus.setOnClickListener {
            viewModel.increase()
        }

        binding.btnMinus.setOnClickListener {
            viewModel.decrease()

        }
    }
}