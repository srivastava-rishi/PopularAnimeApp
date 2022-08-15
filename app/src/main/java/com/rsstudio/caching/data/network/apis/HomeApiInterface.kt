package com.rsstudio.caching.data.network.apis

import com.rsstudio.networkcalling.model.Anime
import retrofit2.http.GET

interface HomeApiInterface {

    @GET("anime")
    suspend fun getTopAnime(): Anime
}