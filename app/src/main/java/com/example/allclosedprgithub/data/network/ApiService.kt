package com.example.allclosedprgithub.data.network

import com.example.allclosedprgithub.data.model.ClosedPullRequestResponse
import retrofit2.http.GET

interface ApiService {

    @GET("repos/aditya-rawat773/All-closed-pr-github/pulls?state=closed")
    suspend fun getClosedPullRequest():ArrayList<ClosedPullRequestResponse>
}