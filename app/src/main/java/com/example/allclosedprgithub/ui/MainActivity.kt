package com.example.allclosedprgithub.ui

import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.allclosedprgithub.databinding.ActivityMainBinding
import com.example.allclosedprgithub.ui.adapter.BaseAdapter
import com.example.allclosedprgithub.util.Resource
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val viewModel: BaseViewModel by viewModels()
    private var job: Job? = null
    private lateinit var baseAdapter: BaseAdapter
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        loadData()
        setRecyclerView()
        observeData()

    }

    private fun loadData() {
        job?.cancel()
        job = lifecycleScope.launch {
            viewModel.getClosedPullRequest()
        }
    }

    private fun setRecyclerView() {
        baseAdapter = BaseAdapter()
        binding.apply {
            rvClosedPullRequest.apply {
                adapter = baseAdapter
                layoutManager = LinearLayoutManager(this@MainActivity)
                this.addItemDecoration(
                    DividerItemDecoration(
                        this@MainActivity,
                        DividerItemDecoration.VERTICAL
                    )
                )
            }
        }
    }

    private fun observeData() {
        lifecycleScope.launch {
            viewModel.postClosedPullRequest.collect {
                when (it) {
                    is Resource.Success -> {
                        baseAdapter.submitData(it.data)
                    }
                    is Resource.Error -> {
                        Toast.makeText(this@MainActivity, "${it.msg}", Toast.LENGTH_SHORT).show()
                    }
                }
            }
        }
    }
}