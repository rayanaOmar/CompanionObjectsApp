package com.example.companionobjectsapp


import android.view.View

class BackgroundClass {
    companion object{
        val day = "day"
        val night = "night"
    }

    fun change(clMain: View, state: String ){
        when(state){
            day -> clMain.setBackgroundResource(R.drawable.day)
            night -> clMain.setBackgroundResource(R.drawable.night)
        }
    }
}