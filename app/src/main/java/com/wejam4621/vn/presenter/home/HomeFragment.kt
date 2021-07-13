package com.wejam4621.vn.presenter.home

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.wejam4621.vn.R
import com.wejam4621.vn.databinding.FragmentHomeBinding
import com.wejam4621.vn.presenter.utils.viewBinding
import dagger.hilt.android.AndroidEntryPoint

/**
 * Created by NGUYEN VAN SON on 28/06/2021.
 * nvs266@gmail.com
 *
 * HOME SCREEN
 * This is the first screen display when user open app
 *
 * Feature:
 * 1. Display Jam List of user
 * 2. A button to navigate to CreateNewJam screen
 */

@AndroidEntryPoint
class HomeFragment : Fragment(R.layout.fragment_home) {

    private val binding by viewBinding(FragmentHomeBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupUi()
    }

    private fun setupUi() {
        // Create new jam button
        binding.fabAddNewJam.setOnClickListener {
            // TODO: Navigate to CreateNewJam screen
        }

        // Jam List
    }
}
