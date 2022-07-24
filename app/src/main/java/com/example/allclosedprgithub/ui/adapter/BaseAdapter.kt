package com.example.allclosedprgithub.ui.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.GlideContext
import com.example.allclosedprgithub.data.model.ClosedPullRequestResponse
import com.example.allclosedprgithub.databinding.ItemClosedPullRequestBinding
import com.example.allclosedprgithub.util.Helper

class BaseAdapter : PagingDataAdapter<ClosedPullRequestResponse, BaseAdapter.ClosedPullRequestViewHolder>(
    ClosedPullRequestComp()
) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ClosedPullRequestViewHolder {
        val binding =
            ItemClosedPullRequestBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ClosedPullRequestViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ClosedPullRequestViewHolder, position: Int) {
            holder.bind(getItem(position)!!)
    }

    class ClosedPullRequestViewHolder(private val binding: ItemClosedPullRequestBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(closedPullRequest: ClosedPullRequestResponse) {
            binding.apply {
                title.text = closedPullRequest.title
                userName.text = closedPullRequest.user.name
                dateCreated.text = closedPullRequest.created_date?.let { Helper.parseDateTime(it) }
                dateClosed.text = closedPullRequest.closed_date?.let { Helper.parseDateTime(it) }
                Glide.with(this.userImage)
                    .load(closedPullRequest.user.avatar_url)
                    .into(userImage)
            }
        }
    }

    class ClosedPullRequestComp : DiffUtil.ItemCallback<ClosedPullRequestResponse>() {
        override fun areItemsTheSame(
            oldItem: ClosedPullRequestResponse,
            newItem: ClosedPullRequestResponse
        ) =
            oldItem.id == newItem.id

        @SuppressLint("DiffUtilEquals")
        override fun areContentsTheSame(
            oldItem: ClosedPullRequestResponse,
            newItem: ClosedPullRequestResponse
        ) =
            oldItem == newItem
    }
}