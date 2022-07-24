package com.example.allclosedprgithub.data.model

data class ClosedPullRequestResponse(
	val title:String?,
	val id:Int,
	val created_date:String?,
	val closed_date:String?,
	val user:User
)



