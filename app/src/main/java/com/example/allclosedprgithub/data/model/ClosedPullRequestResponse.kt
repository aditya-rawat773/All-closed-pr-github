package com.example.allclosedprgithub.data.model

import com.google.gson.annotations.SerializedName

data class ClosedPullRequestResponse(
	val title:String?,
	val id:Int,
	@SerializedName("created_at")
	val created_date:String?,
	@SerializedName("closed_at")
	val closed_date:String?,
	val user:User
)



