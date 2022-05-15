package com.example.materialdesign.domain

import com.example.materialdesign.api.PictureOfTheDayResponse

interface NasaRepository {

    suspend fun pictureOfTheDay(): PictureOfTheDayResponse
}