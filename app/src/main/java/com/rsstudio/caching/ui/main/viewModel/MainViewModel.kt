package com.rsstudio.caching.ui.main.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.rsstudio.caching.data.repository.MainRepository
import com.rsstudio.networkcalling.model.Anime
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel
@Inject
constructor(
    private val repository: MainRepository
) : ViewModel() {

    var logTag = "@MainViewModel"

    // the pattern that i usually follow
    private val _animeData: MutableLiveData<Anime> = MutableLiveData()
    val animeData: LiveData<Anime> get() = _animeData


    init {
       getAnimeInfo()
    }

    private fun getAnimeInfo() {

        viewModelScope.launch {

            val result = repository.getAnimeInfo(1)

            _animeData.value = result

        }
    }



}