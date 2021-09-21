package com.example.recyclerview.services

import com.example.recyclerview.models.MovieResponse
import retrofit2.Call
import retrofit2.http.GET

interface MovieApiInterface {

    @GET("/3/movie/popular?api_key=d81c7bb5e465be412d804f38c0f8d561")
    fun getMovieList(): Call<MovieResponse>
}