package com.example.sunnyweather.ui.weather

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.switchMap
import com.example.sunnyweather.logic.Repository
import com.example.sunnyweather.logic.model.Location

class WeatherViewModel: ViewModel() {
    private val locationLiveData = MutableLiveData<Location>()
    var locationLng = ""
    var locationLat = ""
    var placeName = ""

    fun refreshWeather(lng: String, lat: String){
        locationLiveData.value = Location(lng, lat)
    }

    val weatherLiveData = locationLiveData.switchMap {
        location->
        Repository.refreshWeather(location.lng, location.lat)
    }
}