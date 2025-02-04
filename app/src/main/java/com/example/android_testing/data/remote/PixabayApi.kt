package com.example.android_testing.data.remote

import com.example.android_testing.BuildConfig
import com.example.android_testing.data.remote.response.ImageResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface PixabayApi {

    @GET(".")
    suspend fun searchForImage(
        @Query("q") searchQuery : String,
        @Query("key") apiKey : String = BuildConfig.API_KEY
    ): Response<ImageResponse>
}