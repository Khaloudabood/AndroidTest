package com.example.android.getyourage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }//end onCreate
    fun bnClickEvent(view:View){
        //button is clicked
        val yearOfBirth:Int = editTextYearOfBirth.text.toString().toInt()
        val currentYear = Calendar.getInstance().get(Calendar.YEAR)
        val age = currentYear - yearOfBirth
        textViewAgeShow.text = "Your age is " + age + "years old"

    }//end bnClickEvent()

}//end class