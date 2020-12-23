package com.example.koinexample.view

import com.example.koinexample.R
import com.example.koinexample.base.BaseActivity
import com.example.koinexample.databinding.ActivityMainBinding
import com.example.koinexample.viewmodel.MainViewModel

class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>() {
    override val resource: Int
        get() = R.layout.activity_main
    override val viewModel = MainViewModel()

    override fun initStartView() {
        binding.textView.text = "hello MVVM!"
    }

    override fun initDataBinding() {

    }

    override fun initAfterBinding() {

    }
}