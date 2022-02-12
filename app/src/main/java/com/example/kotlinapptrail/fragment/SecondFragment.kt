package com.example.kotlinapptrail.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.kotlinapptrail.R
import com.example.kotlinapptrail.databinding.FragmentSecondBinding
import com.example.kotlinapptrail.interfaces.fragmentCommunicator

class SecondFragment : Fragment() {

    private lateinit var binding : FragmentSecondBinding
    private lateinit var fragmentCommunicator: fragmentCommunicator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_second,container,false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        fragmentCommunicator = activity as fragmentCommunicator

        binding.text2.text = arguments?.getString("message")

        binding.backButton.setOnClickListener {

            fragmentCommunicator.passData("",FirstFragment())
        }
    }
}