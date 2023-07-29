package com.odoobocalvin.calculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView



class calac2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calac2)
    }

    @SuppressLint("SetTextI18n")
    fun add(view: View) {

        val firstnumb = view.findViewById<EditText>(R.id.firstno)
        val secondnumb = view.findViewById<EditText>(R.id.secondno)

        val value = firstnumb.text.toString()
        val secondvalue = secondnumb.text.toString()

        val firstnum = value.toDoubleOrNull()
        val secondnum = secondvalue.toDoubleOrNull()

        val answer: Double =when{
            firstnum == null || secondnum == null -> 0.0
            else -> firstnum + secondnum
        }
        val resultTv = view.findViewById<TextView>(R.id.answer1)
        resultTv.text  = "Your answer is $answer"
    }
    @SuppressLint("SetTextI18n")
    fun subtract(view: View) {
        val first = view.findViewById<EditText>(R.id.firstno)
        val second = view.findViewById<EditText>(R.id.secondno)

        val value = first.text.toString()
        val secondvalue = second.text.toString()

        val firstnum = value.toDoubleOrNull()
        val secondnum = secondvalue.toDoubleOrNull()

        val answer: Double = when{
            firstnum == null || secondnum == null -> 0.0
            else -> firstnum - secondnum
        }
        val resultTv = view.findViewById<TextView>(R.id.answer1)
        resultTv.text  = "Your answer is $answer"
    }
    fun divide(view: View) {}
    fun multiply(view: View) {}
}