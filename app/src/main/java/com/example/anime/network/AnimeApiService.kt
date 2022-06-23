package com.example.anime.network

import com.example.anime.entity.Response
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET

private const val BASE_URL = "https://api.waifu.im"

private val retrofit = Retrofit.Builder()
    .addConverterFactory(MoshiConverterFactory.create())
    .baseUrl(BASE_URL)
    .build()

interface AnimeApiService {
    @GET("/random")
   suspend fun getData(): Response
}

object AnimeApi {
    val retrofitService: AnimeApiService by lazy {
        retrofit.create(AnimeApiService::class.java)
    }
}