package com.example.allclosedprgithub.data.network

import com.example.allclosedprgithub.data.model.ClosedPullRequestResponse
import retrofit2.http.GET

interface ApiService {
    @GET("repos/square/retrofit/pulls?state=closed")
    suspend fun getClosedPullRequest(): ArrayList<ClosedPullRequestResponse>
}