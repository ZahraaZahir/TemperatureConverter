package com.zahraazahir.temperatureconventer.viewModels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.zahraazahir.temperatureconventer.util.TemperatureColor

class MainViewModel : ViewModel() {

    val temperatureColor = MutableLiveData<TemperatureColor>()
    val temperatureInFahrenheit = MutableLiveData<String>()

    fun changeColorInTemperatureRange(value: Double) =
        when {
            value < 0.0 -> temperatureColor.postValue(TemperatureColor.BLUE)
            value in 0.0..20.0 -> temperatureColor.postValue(TemperatureColor.GREEN)
            value in 21.0..30.0 -> temperatureColor.postValue(TemperatureColor.YELLOW)
            value in 31.0..40.0 -> temperatureColor.postValue(TemperatureColor.ORANGE)
            else -> temperatureColor.postValue(TemperatureColor.RED)
        }

}