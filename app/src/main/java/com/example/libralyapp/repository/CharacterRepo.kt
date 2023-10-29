package com.example.libralyapp.repository

import com.example.libralyapp.retrofit.Character
import com.example.libralyapp.retrofit.CharacterApi

class CharacterRepo(private  val characterApi: CharacterApi) {

    suspend fun getCharacters(): List<Character>{
        return characterApi.getCharacters()
    }
}