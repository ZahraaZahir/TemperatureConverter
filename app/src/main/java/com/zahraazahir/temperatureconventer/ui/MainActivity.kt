package com.zahraazahir.temperatureconventer.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.zahraazahir.temperatureconventer.R
import com.zahraazahir.temperatureconventer.databinding.ActivityMainBinding
import com.zahraazahir.temperatureconventer.viewModels.MainViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    private val viewModel : MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this , R.layout.activity_main)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this


        viewModel.temperatureInFahrenheit
            .observe(this , {

            if(it.isNullOrEmpty()) binding.temperatureInCelsius.text = ""
            else {
                val temperatureInCelsius = (it.toDouble() - 32) * 1.8
                binding.temperatureInCelsius.text = temperatureInCelsius.toString()
                viewModel.changeColorInTemperatureRange(temperatureInCelsius)
            }
        })
    }
}