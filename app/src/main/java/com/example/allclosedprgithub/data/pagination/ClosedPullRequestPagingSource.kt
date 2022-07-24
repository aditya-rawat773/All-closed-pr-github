package com.example.allclosedprgithub.data.pagination

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.example.allclosedprgithub.data.model.ClosedPullRequestResponse
import com.example.allclosedprgithub.data.network.ApiService
import java.lang.Exception
import javax.inject.Inject

class ClosedPullRequestPagingSource @Inject constructor(
    private val apiService: ApiService
) : PagingSource<Int, ClosedPullRequestResponse>() {
    override fun getRefreshKey(state: PagingState<Int, ClosedPullRequestResponse>): Int? {
        return state.anchorPosition?.let { anchorPosition ->
            state.closestPageToPosition(anchorPosition)?.prevKey?.plus(1)
                ?: state.closestPageToPosition(anchorPosition)?.nextKey?.minus(1)
        }
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, ClosedPullRequestResponse> {
        return try {
            val page = params.key ?: FIRST_PAGE
            val response = apiService.getClosedPullRequest(page)
            LoadResult.Page(
                data = response,
                prevKey = if (page == FIRST_PAGE) null else page - 1,
                nextKey = if (response.isEmpty()) null else page + 1
            )
        } catch (e: Exception) {
            LoadResult.Error(e)
        }
    }

    companion object {
        private const val FIRST_PAGE = 1
    }
}
