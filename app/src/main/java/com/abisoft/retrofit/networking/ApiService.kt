package com.abisoft.retrofit.networking

import com.abisoft.retrofit.MarvelData
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("api/v1/task/get_all_tasks")
    fun getMarvels(): Call<List<MarvelData>>
}
//