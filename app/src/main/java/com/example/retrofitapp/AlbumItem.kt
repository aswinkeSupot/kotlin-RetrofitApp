package com.example.retrofitapp

import com.google.gson.annotations.SerializedName

/**
 * Created by Aswin on 11-09-2024.
 *
 * 1- Data Classes (POJO)
 */
data class AlbumItem(
    @SerializedName("id")
    val id: Int,

    @SerializedName("userId")
    val userId: Int,

    @SerializedName("title")
    val title: String
)