package com.rsstudio.caching.data.repository

import com.rsstudio.caching.data.network.apis.AnimeApiInterface
import com.rsstudio.networkcalling.model.Anime
import javax.inject.Inject

class MainRepository
@Inject
constructor(private val api: AnimeApiInterface) {

    suspend fun getAnimeInfo(page:Int) : Anime {
       return api.getTopAnime(page)
    }
}