package com.example.allclosedprgithub.data.model

import com.google.gson.annotations.SerializedName

//data class ClosedPullRequestResponse(
//	val response: ArrayList<ClosedPullRequestResponseItem>? = null
//)

data class ClosedPullRequestResponse(
	val title:String?,
	@SerializedName("created_at")
	val created_date:String?,
	@SerializedName("closed_at")
	val closed_date:String?,
	val user:User
)

data class User(
	@SerializedName("login")
	val name: String,
	val avatar_url:String?
)


