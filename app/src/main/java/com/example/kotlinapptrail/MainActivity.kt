package com.example.kotlinapptrail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.kotlinapptrail.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit  var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

            val manager: FragmentManager = supportFragmentManager
            val transaction: FragmentTransaction = manager.beginTransaction()
            transaction.replace(R.id.fragmentContainer,FirstFragment())
            transaction.commit()



    }
}