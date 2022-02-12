package com.example.kotlinapptrail.fragment

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import com.example.kotlinapptrail.R
import com.example.kotlinapptrail.databinding.FragmentFirstBinding
import com.example.kotlinapptrail.interfaces.fragmentCommunicator
import androidx.core.content.ContextCompat.getSystemService




class FirstFragment : Fragment() {

    private lateinit var binding : FragmentFirstBinding
    private lateinit var fragmentCommunicator: fragmentCommunicator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_first,container,false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        fragmentCommunicator = activity as fragmentCommunicator

        binding.nextButton.setOnClickListener {
            fragmentCommunicator.passData(binding.editText.text.toString(),SecondFragment())
        }
    }
}