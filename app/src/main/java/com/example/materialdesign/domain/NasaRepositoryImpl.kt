package com.example.materialdesign.domain

import com.example.materialdesign.api.NasaApi
import com.example.materialdesign.api.PictureOfTheDayResponse
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class NasaRepositoryImpl : NasaRepository {

    private val api = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl("https://api.nasa.gov/")
        .client(OkHttpClient.Builder().apply {
            addInterceptor(HttpLoggingInterceptor().apply {
                level = HttpLoggingInterceptor.Level.BODY
            })
        }
            .build()
        )
        .build()
        .create(NasaApi::class.java)



    override suspend fun pictureOfTheDay(): PictureOfTheDayResponse =
        api.pictureOfTheDay("9sUCoSYyZtguZosOLeqYHVfq0zl0tqe58ml1xiDK")


}



