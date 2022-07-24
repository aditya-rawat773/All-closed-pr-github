package com.example.allclosedprgithub.data

import android.util.Log
import com.example.allclosedprgithub.data.model.ClosedPullRequestResponse
import com.example.allclosedprgithub.data.network.RetrofitInstance
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class Repository @Inject constructor(
    private val retrofitInstance: RetrofitInstance
) {
    fun getClosedPullRequest(): Flow<ArrayList<ClosedPullRequestResponse>> {
        return flow {
            val data = retrofitInstance.getClosedPullRequest()
            emit(data)
        }
    }
}