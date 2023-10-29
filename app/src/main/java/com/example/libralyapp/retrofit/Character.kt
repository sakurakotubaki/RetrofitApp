package com.example.libralyapp.retrofit

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Character(

    @Json(name = "actor")
    val actor: String,

    @Json(name = "image")
    val image: String,
)
