package com.example.libralyapp.retrofit

import retrofit2.http.GET

interface CharacterApi {

    @GET("characters") // END-POINT
    suspend fun getCharacters(): List<Character>
}