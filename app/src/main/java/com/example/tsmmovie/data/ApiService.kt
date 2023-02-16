package com.example.tsmmovie.data

import retrofit2.http.GET

//  Bagian untuk request ke webservice
interface ApiService {
    // untuk mendapatkan value dari API dengan cara mengirimkan request
    @GET("API/MostPopularMovies/k_9v5jw2c1")
    suspend fun getMostPopularMovies() : MovieResponse

    /*@GET("510fb38a-4326-4d9c-b079-07281d51570e")
    suspend fun getMostPopularMovies() : MovieResponse
    //https://run.mocky.io/v3/510fb38a-4326-4d9c-b079-07281d51570e*/
}