package com.example.allclosedprgithub.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.allclosedprgithub.R
import com.example.allclosedprgithub.databinding.ActivityMainBinding
import com.example.allclosedprgithub.ui.adapter.BaseAdapter
import com.example.allclosedprgithub.util.Resource
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val viewModel: BaseViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel.getClosedPullRequest()

        val baseAdapter = BaseAdapter()
        binding.apply {
            rvClosedPullRequest.apply {
                adapter = baseAdapter
                layoutManager = LinearLayoutManager(this@MainActivity)
            }
        }

        lifecycleScope.launch {
            viewModel.postClosedPullRequest.collect {
                when (it) {
                    is Resource.Success -> {
                        baseAdapter.submitList(it.data)
                    }
                }
            }
        }
    }
}