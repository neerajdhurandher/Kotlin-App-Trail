package com.example.kotlinapptrail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.kotlinapptrail.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit  var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.button1.setOnClickListener {

            binding.text1.text = getString(R.string.welcome_text)

        }
    }
}