package com.zahraazahir.temperatureconventer

import android.view.View
import androidx.core.content.ContextCompat
import androidx.databinding.BindingAdapter
import com.zahraazahir.temperatureconventer.util.TemperatureColor

@BindingAdapter(value = ["onTemperatureChange"])

fun setTemperatureColors(view : View , temperatureColor:TemperatureColor?) {

    when(temperatureColor){

        TemperatureColor.BLUE ->
            view.setBackgroundColor(ContextCompat.getColor(view.context , R.color.blue))
        TemperatureColor.GREEN ->
            view.setBackgroundColor(ContextCompat.getColor(view.context , R.color.green))
        TemperatureColor.YELLOW ->
            view.setBackgroundColor(ContextCompat.getColor(view.context , R.color.yellow))
        TemperatureColor.ORANGE ->
            view.setBackgroundColor(ContextCompat.getColor(view.context , R.color.orange))
        TemperatureColor.RED ->
            view.setBackgroundColor(ContextCompat.getColor(view.context , R.color.red))
        null ->
            view.setBackgroundColor(ContextCompat.getColor(view.context , R.color.white))

    }
}


