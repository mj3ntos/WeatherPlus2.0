package com.app.weatherplus2.data.api

import com.app.weatherplus2.data.model.WeatherResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("data/2.5/weather")
    suspend fun getWeatherByCoordinates(
        @Query("lat") lat: Float,
        @Query("lon") lon: Float,
        @Query("appid") apiKey: String,
        @Query("units") units: String = "metric",
        @Query("lang") lang: String = "pl"
    ): WeatherResponse

    @GET("data/2.5/weather")
    suspend fun getWeatherByCity(
        @Query("q") cityName: String,
        @Query("appid") apiKey: String,
        @Query("units") units: String = "metric",
        @Query("lang") lang: String = "pl"
    ): WeatherResponse
}