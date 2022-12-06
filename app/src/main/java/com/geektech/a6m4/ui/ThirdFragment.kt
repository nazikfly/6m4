package com.geektech.a6m4.ui
import android.view.LayoutInflater
import androidx.lifecycle.ViewModelProvider
import com.geektech.a6m4.adapters.PageAdapter
import com.geektech.a6m4.base.BaseFragment
import com.geektech.a6m4.databinding.FragmentThirdBinding

class ThirdFragment : BaseFragment<FragmentThirdBinding, MainViewModel>() {

    private lateinit var viewModel: MainViewModel
    private lateinit var data:ArrayList<String>

    override fun inflateViewBinding(inflater: LayoutInflater): FragmentThirdBinding {
        return FragmentThirdBinding.inflate(layoutInflater)
    }

    override fun initViewModel() {
        viewModel = ViewModelProvider(requireActivity())[MainViewModel::class.java]
    }

    override fun initView() {
        viewModel.operation.observe(viewLifecycleOwner) {
            val adapter = PageAdapter(it)
            binding.recyclerView2.adapter = adapter
        }

    }
}