package com.app.weatherplus2.data.model


data class WeatherResponse(
    val base: String,
    val visibility: Int,
    val dt: Long,
    val timezone: Int,
    val id: Int,
    val name: String,
    val cod: Int,
    val coord: Coord,
    val weather: List<Weather>,
    val main: Main,
    val wind: Wind,
    val clouds: Clouds,
    val sys: Sys
)

data class Coord(
    val lon: Float,
    val lat: Float
)

data class Weather(
    val id: Int,
    val main: String,
    val description: String,
    val icon: String
)

data class Main(
    val temp: Float,
    val feels_like: Float,
    val temp_min: Float,
    val temp_max: Float,
    val pressure: Int,
    val humidity: Int,
    val sea_level: Int,
    val grnd_level: Int
)

data class Wind(
    val speed: Float,
    val deg: Int
)

data class Clouds(
    val all: Int
)

data class Sys(
    val type: Int,
    val id: Int,
    val country: String,
    val sunrise: Int,
    val sunset: Int
)
