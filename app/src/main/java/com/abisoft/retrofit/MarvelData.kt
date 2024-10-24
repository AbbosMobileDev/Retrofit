package com.abisoft.retrofit

import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable

@Serializable
data class MarvelData(
    @SerializedName("task_id") val taskId: Int,
    @SerializedName("index") val index: Int,
    @SerializedName("project_id") val projectId: String,
    @SerializedName("project_name") val projectName: String,
    @SerializedName("owner_id") val ownerId: Int,
    @SerializedName("owner_name") val ownerName: String,
    @SerializedName("owner_avatar") val ownerAvatar: String,
    @SerializedName("executor_id") val executorId: Int,
    @SerializedName("executor_name") val executorName: String,
    @SerializedName("executor_avatar") val executorAvatar: String,
    @SerializedName("task_date") val taskDate: String,
    @SerializedName("term_date") val termDate: String,
    @SerializedName("name") val name: String,
    @SerializedName("priority") val priority: String,
    @SerializedName("status") val status: String
)
