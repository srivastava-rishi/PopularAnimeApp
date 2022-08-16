package com.rsstudio.caching.data.network.apis

import com.rsstudio.networkcalling.model.Anime
import retrofit2.http.GET
import retrofit2.http.Query

interface AnimeApiInterface {

    @GET("anime")
    suspend fun getTopAnime(
        @Query("page") page:Int
    ): Anime
}