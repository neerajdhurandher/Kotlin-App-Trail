package com.example.kotlinapptrail.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.kotlinapptrail.fragment.FirstFragment
import com.example.kotlinapptrail.R
import com.example.kotlinapptrail.databinding.ActivityMainBinding
import com.example.kotlinapptrail.fragment.SecondFragment
import com.example.kotlinapptrail.interfaces.fragmentCommunicator

class MainActivity : AppCompatActivity(),fragmentCommunicator {

    private lateinit  var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

            val manager: FragmentManager = supportFragmentManager
            val transaction: FragmentTransaction = manager.beginTransaction()
            transaction.replace(R.id.fragmentContainer, FirstFragment())
            transaction.commit()



    }

    override fun passData(ediTextInput: String , fragment : Fragment) {
        val bundle = Bundle()
        bundle.putString("message", ediTextInput)

        val transaction = this.supportFragmentManager.beginTransaction()

        fragment.arguments = bundle
        transaction.replace(R.id.fragmentContainer,fragment).commit()
    }
}