package com.example.allclosedprgithub.data.network

import com.example.allclosedprgithub.data.model.ClosedPullRequestResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("repos/square/retrofit/pulls?state=closed&per_page=10")
    suspend fun getClosedPullRequest(
        @Query("page") page: Int
    ): ArrayList<ClosedPullRequestResponse>
}