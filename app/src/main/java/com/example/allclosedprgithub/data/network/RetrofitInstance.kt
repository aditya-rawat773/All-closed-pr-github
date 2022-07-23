package com.example.allclosedprgithub.data.network

import com.example.allclosedprgithub.data.model.ClosedPullRequestResponse
import javax.inject.Inject

class RetrofitInstance @Inject constructor(
    private val apiService: ApiService
) {
    suspend fun getClosedPullRequest(): ArrayList<ClosedPullRequestResponse> {
        return apiService.getClosedPullRequest()
    }
}