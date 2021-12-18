package com.han.melon.service

import retrofit2.Call
import retrofit2.http.GET

interface MusicService {
    @GET("/v3/fb5c6b4c-2d18-4612-b2a7-71b2ecea047c")
    fun listMusics(): Call<MusicDto>

}