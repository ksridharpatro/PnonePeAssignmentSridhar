package com.example.pnonepeassignmentsridhar.network

import com.google.gson.GsonBuilder
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface NetworkApi {

    companion object {
        private const val BASE_URL: String = "baseurl"

        fun create(): NetworkApi {
            //The gson builder
            val gson = GsonBuilder()
                .setLenient()
                .create()
            //creating retrofit object
            val retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build()
            //creating our api
            return retrofit.create(NetworkApi::class.java)
        }
    }

    @GET("endpoint")
    suspend fun getMovieList(): List<MovieNetworkModel>
}