package com.example.weatherappcourse.adapters

data class WeatherModel(
    val city: String,
    var time: String,
    val condition: String,
    val currentTemp: String,
    val maxTemp: String,
    val minTemp: String,
    val imageUrl: String,
    val hours: String
)