package com.example.allclosedprgithub.data

import androidx.paging.Pager
import androidx.paging.PagingConfig
import com.example.allclosedprgithub.data.network.ApiService
import com.example.allclosedprgithub.data.pagination.ClosedPullRequestPagingSource
import javax.inject.Inject

class Repository @Inject constructor(
    private val apiService:ApiService
) {
    fun getClosedPullRequest() = Pager(
        pagingSourceFactory = {ClosedPullRequestPagingSource(apiService)},
        config = PagingConfig(pageSize = 10)
    ).flow
}