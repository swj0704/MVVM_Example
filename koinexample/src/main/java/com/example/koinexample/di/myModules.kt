package com.example.koinexample.di

import com.example.koinexample.viewmodel.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val myModules = module {
    viewModel { MainViewModel() }
}