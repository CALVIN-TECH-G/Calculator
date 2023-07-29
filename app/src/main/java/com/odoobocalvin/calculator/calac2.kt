package com.odoobocalvin.calculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView



class calac2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calac2)
        val i = findViewById<Button>(R.id.add)
        i.setOnClickListener {
            val firstnumb = findViewById<EditText>(R.id.firstno)
            val secondnumb = findViewById<EditText>(R.id.secondno)

            val value = firstnumb.text.toString()
            val secondvalue = secondnumb.text.toString()

            val firstnum = value.toDoubleOrNull()
            val secondnum = secondvalue.toDoubleOrNull()

            val answer: Double = when {
                firstnum == null || secondnum == null -> 0.0
                else -> firstnum + secondnum

            }
            val resultTv = findViewById<TextView>(R.id.answer1)
            resultTv.text = "Your answer is $answer"
        }
    }

    fun subtract(view: View) {
        val first = findViewById<EditText>(R.id.firstno)
        val second = findViewById<EditText>(R.id.secondno)

        val value = first.text.toString()
        val secondvalue = second.text.toString()

        val firstnum = value.toDoubleOrNull()
        val secondnum = secondvalue.toDoubleOrNull()

        val answer: Double = when {
            firstnum == null || secondnum == null -> 0.0
            else -> firstnum - secondnum
        }
        val resultTv = findViewById<TextView>(R.id.answer1)
        resultTv.text = "Your answer is $answer"
    }

    fun divide(view: View) {
        val first = findViewById<EditText>(R.id.firstno)
        val second = findViewById<EditText>(R.id.secondno)

        val value = first.text.toString()
        val secondvalue = second.text.toString()

        val firstnum = value.toDoubleOrNull()
        val secondnum = secondvalue.toDoubleOrNull()

        val answer: Double = when {
            firstnum == null || secondnum == null -> 0.0
            else -> firstnum / secondnum
        }
        val resultTv = findViewById<TextView>(R.id.answer1)
        resultTv.text = "Your answer is $answer"
    }
    fun multiply(view: View) {
        val first = findViewById<EditText>(R.id.firstno)
        val second = findViewById<EditText>(R.id.secondno)

        val value = first.text.toString()
        val secondvalue = second.text.toString()

        val firstnum = value.toDoubleOrNull()
        val secondnum = secondvalue.toDoubleOrNull()

        val answer: Double = when {
            firstnum == null || secondnum == null -> 0.0
            else -> firstnum * secondnum
        }
        val resultTv = findViewById<TextView>(R.id.answer1)
        resultTv.text = "Your answer is $answer"
    }
}