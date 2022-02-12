package com.example.kotlinapptrail.interfaces

import androidx.fragment.app.Fragment

interface fragmentCommunicator {

    fun passData(ediTextInput:String , fragment: Fragment)
}