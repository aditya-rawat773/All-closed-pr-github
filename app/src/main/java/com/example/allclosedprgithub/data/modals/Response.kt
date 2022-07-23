package com.example.allclosedprgithub.data.modals

data class Response(
	val response: ArrayList<ResponseItem?>? = null
)

data class Owner(
	val gistsUrl: String? = null,
	val reposUrl: String? = null,
	val followingUrl: String? = null,
	val starredUrl: String? = null,
	val login: String? = null,
	val followersUrl: String? = null,
	val type: String? = null,
	val url: String? = null,
	val subscriptionsUrl: String? = null,
	val receivedEventsUrl: String? = null,
	val avatarUrl: String? = null,
	val eventsUrl: String? = null,
	val htmlUrl: String? = null,
	val siteAdmin: Boolean? = null,
	val id: Int? = null,
	val gravatarId: String? = null,
	val nodeId: String? = null,
	val organizationsUrl: String? = null
)

data class User(
	val gistsUrl: String? = null,
	val reposUrl: String? = null,
	val followingUrl: String? = null,
	val starredUrl: String? = null,
	val login: String? = null,
	val followersUrl: String? = null,
	val type: String? = null,
	val url: String? = null,
	val subscriptionsUrl: String? = null,
	val receivedEventsUrl: String? = null,
	val avatarUrl: String? = null,
	val eventsUrl: String? = null,
	val htmlUrl: String? = null,
	val siteAdmin: Boolean? = null,
	val id: Int? = null,
	val gravatarId: String? = null,
	val nodeId: String? = null,
	val organizationsUrl: String? = null
)

data class ReviewComments(
	val href: String? = null
)

data class ResponseItem(
	val issueUrl: String? = null,
	val links: Links? = null,
	val diffUrl: String? = null,
	val createdAt: String? = null,
	val assignees: List<Any?>? = null,
	val requestedReviewers: List<Any?>? = null,
	val title: String? = null,
	val body: Any? = null,
	val requestedTeams: List<Any?>? = null,
	val head: Head? = null,
	val authorAssociation: String? = null,
	val number: Int? = null,
	val patchUrl: String? = null,
	val updatedAt: String? = null,
	val draft: Boolean? = null,
	val mergeCommitSha: String? = null,
	val commentsUrl: String? = null,
	val reviewCommentUrl: String? = null,
	val activeLockReason: Any? = null,
	val id: Int? = null,
	val state: String? = null,
	val locked: Boolean? = null,
	val commitsUrl: String? = null,
	val closedAt: String? = null,
	val statusesUrl: String? = null,
	val mergedAt: String? = null,
	val autoMerge: Any? = null,
	val url: String? = null,
	val labels: List<Any?>? = null,
	val milestone: Any? = null,
	val htmlUrl: String? = null,
	val reviewCommentsUrl: String? = null,
	val assignee: Any? = null,
	val user: User? = null,
	val nodeId: String? = null,
	val base: Base? = null
)

data class Links(
	val comments: Comments? = null,
	val issue: Issue? = null,
	val self: Self? = null,
	val reviewComments: ReviewComments? = null,
	val commits: Commits? = null,
	val statuses: Statuses? = null,
	val html: Html? = null,
	val reviewComment: ReviewComment? = null
)

data class Base(
	val ref: String? = null,
	val repo: Repo? = null,
	val label: String? = null,
	val sha: String? = null,
	val user: User? = null
)

data class Self(
	val href: String? = null
)

data class Commits(
	val href: String? = null
)

data class Comments(
	val href: String? = null
)

data class Repo(
	val allowForking: Boolean? = null,
	val stargazersCount: Int? = null,
	val isTemplate: Boolean? = null,
	val pushedAt: String? = null,
	val subscriptionUrl: String? = null,
	val language: String? = null,
	val branchesUrl: String? = null,
	val issueCommentUrl: String? = null,
	val labelsUrl: String? = null,
	val subscribersUrl: String? = null,
	val releasesUrl: String? = null,
	val svnUrl: String? = null,
	val id: Int? = null,
	val forks: Int? = null,
	val archiveUrl: String? = null,
	val gitRefsUrl: String? = null,
	val forksUrl: String? = null,
	val visibility: String? = null,
	val statusesUrl: String? = null,
	val sshUrl: String? = null,
	val license: Any? = null,
	val fullName: String? = null,
	val size: Int? = null,
	val languagesUrl: String? = null,
	val htmlUrl: String? = null,
	val collaboratorsUrl: String? = null,
	val cloneUrl: String? = null,
	val name: String? = null,
	val pullsUrl: String? = null,
	val defaultBranch: String? = null,
	val hooksUrl: String? = null,
	val treesUrl: String? = null,
	val tagsUrl: String? = null,
	val jsonMemberPrivate: Boolean? = null,
	val contributorsUrl: String? = null,
	val hasDownloads: Boolean? = null,
	val notificationsUrl: String? = null,
	val openIssuesCount: Int? = null,
	val description: Any? = null,
	val createdAt: String? = null,
	val watchers: Int? = null,
	val keysUrl: String? = null,
	val deploymentsUrl: String? = null,
	val hasProjects: Boolean? = null,
	val archived: Boolean? = null,
	val hasWiki: Boolean? = null,
	val updatedAt: String? = null,
	val commentsUrl: String? = null,
	val stargazersUrl: String? = null,
	val disabled: Boolean? = null,
	val gitUrl: String? = null,
	val hasPages: Boolean? = null,
	val owner: Owner? = null,
	val commitsUrl: String? = null,
	val compareUrl: String? = null,
	val gitCommitsUrl: String? = null,
	val topics: List<Any?>? = null,
	val blobsUrl: String? = null,
	val gitTagsUrl: String? = null,
	val mergesUrl: String? = null,
	val downloadsUrl: String? = null,
	val hasIssues: Boolean? = null,
	val webCommitSignoffRequired: Boolean? = null,
	val url: String? = null,
	val contentsUrl: String? = null,
	val mirrorUrl: Any? = null,
	val milestonesUrl: String? = null,
	val teamsUrl: String? = null,
	val fork: Boolean? = null,
	val issuesUrl: String? = null,
	val eventsUrl: String? = null,
	val issueEventsUrl: String? = null,
	val assigneesUrl: String? = null,
	val openIssues: Int? = null,
	val watchersCount: Int? = null,
	val nodeId: String? = null,
	val homepage: Any? = null,
	val forksCount: Int? = null
)

data class Issue(
	val href: String? = null
)

data class Head(
	val ref: String? = null,
	val repo: Repo? = null,
	val label: String? = null,
	val sha: String? = null,
	val user: User? = null
)

data class ReviewComment(
	val href: String? = null
)

data class Statuses(
	val href: String? = null
)

data class Html(
	val href: String? = null
)

