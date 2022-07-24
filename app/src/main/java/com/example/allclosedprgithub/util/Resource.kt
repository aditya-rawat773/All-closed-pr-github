package com.example.allclosedprgithub.util

import androidx.paging.PagingData
import com.example.allclosedprgithub.data.model.ClosedPullRequestResponse

sealed class Resource {
    object Loading : Resource()
    class Error(val msg: Throwable) : Resource()
    class Success(val data: PagingData<ClosedPullRequestResponse>): Resource()
    object Empty : Resource()
}