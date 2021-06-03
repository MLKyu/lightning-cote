package com.alansoft.lightningcote.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.alansoft.lightningcote.R
import com.alansoft.lightningcote.databinding.FragmentMainBinding

/**
 * Created by LEE MIN KYU on 2021/06/03
 * Copyright © 2021 Dreamus Company. All rights reserved.
 */
class MainFragment : Fragment() {
    lateinit var binding: FragmentMainBinding
    val viewModel: MainViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_main, container, false)
        binding.viewModel = viewModel
        return binding.root
    }
}