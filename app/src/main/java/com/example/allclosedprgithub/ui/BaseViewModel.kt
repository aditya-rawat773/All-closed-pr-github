package com.example.allclosedprgithub.ui

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.allclosedprgithub.data.Repository
import com.example.allclosedprgithub.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class BaseViewModel @Inject constructor(
    private val repository: Repository
) : ViewModel() {
    private var job: Job? = null

    private val _postClosedPullRequest: MutableStateFlow<Resource> =
        MutableStateFlow(Resource.Empty)
    val postClosedPullRequest: MutableStateFlow<Resource> = _postClosedPullRequest

    fun getClosedPullRequest() {
        job = viewModelScope.launch {
            _postClosedPullRequest.value = Resource.Loading
            repository.getClosedPullRequest()
                .catch {
                    _postClosedPullRequest.value = Resource.Error(it)
                }
                .collect {
                    _postClosedPullRequest.value = Resource.Success(it)
                    Log.d("aditya", "getClosedPullRequest:$it ")
                }
        }
    }
}