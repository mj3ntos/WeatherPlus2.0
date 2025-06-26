package com.app.weatherplus2.data.repository

import android.util.Log
import com.app.weatherplus2.data.api.ApiService
import com.app.weatherplus2.data.model.WeatherResponse

class WeatherRepository(private val apiService: ApiService) {
    val TAG = "WeatherRepository"

    suspend fun getWeatherByCity(cityName: String, apiKey: String): Result<WeatherResponse> {
        return try {
            val response = apiService.getWeatherByCity(cityName, apiKey)
            Result.success(response)
        } catch (e: Exception) {
            Log.d(TAG, "Api error: ${e.message}")
            Result.failure(e)
        }
    }

    suspend fun getWeatherByCoordinates(lat: Float, lon: Float, apiKey: String): Result<WeatherResponse> {
        return try {
            val response = apiService.getWeatherByCoordinates(lat, lon, apiKey)
            Result.success(response)
        } catch (e: Exception) {
            Log.d(TAG, "Api error: ${e.message}")
            Result.failure(e)
        }
    }
}