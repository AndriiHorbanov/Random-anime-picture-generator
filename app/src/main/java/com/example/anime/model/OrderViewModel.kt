package com.example.anime.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.anime.entity.Response
import com.example.anime.network.AnimeApi
import kotlinx.coroutines.launch

class OrderViewModel:ViewModel() {

    private val _animeStatus = MutableLiveData<Response>()
    val animeStatus: LiveData<Response> = _animeStatus

    init {
        getAnimeData()
    }

    fun getAnimeData(){
        viewModelScope.launch {
            val response = AnimeApi.retrofitService.getData()
            _animeStatus.value = response
        }
    }
}