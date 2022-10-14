package com.example.assignment2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.text.isDigitsOnly

class MainActivity : AppCompatActivity() {

    private lateinit var plusButton : Button
    private lateinit var minusButton : Button
    private lateinit var multiplyButton : Button
    private lateinit var divideButton : Button
    private lateinit var resultText : TextView
    private lateinit var firstNumber : TextView
    private lateinit var secondNumber : TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        plusButton = findViewById(R.id.plus)
        minusButton = findViewById(R.id.minus)
        multiplyButton = findViewById(R.id.multiply)
        divideButton = findViewById(R.id.divide)
        firstNumber = findViewById(R.id.firstNumber)
        secondNumber = findViewById(R.id.secondNumber)
        //resultText = findViewById(R.id.resultText)

        plusButton.setOnClickListener{
            plus()
        }
        minusButton.setOnClickListener{
            minus()
        }
        multiplyButton.setOnClickListener{
            multiply()
        }
        divideButton.setOnClickListener{
            divide()
        }
    }

    fun plus(){
        if (firstNumber.text.toString().isNotEmpty() && secondNumber.text.toString().isNotEmpty()){

            val result = firstNumber.text.toString().toFloat() + secondNumber.text.toString().toFloat()
            val intent =  Intent (this, SecondActivity::class.java)
            intent.putExtra("message_key", result.toString())
            startActivity(intent)

        }
        else{
            Toast.makeText(this, "Enter valid number",Toast.LENGTH_SHORT).show()
        }
    }

    fun minus(){
        if (firstNumber.text.toString().isNotEmpty() && secondNumber.text.toString().isNotEmpty()){

            val result = firstNumber.text.toString().toFloat() - secondNumber.text.toString().toFloat()
            val intent =  Intent (this, SecondActivity::class.java)
            intent.putExtra("message_key", result.toString())
            startActivity(intent)

        }
        else{
            Toast.makeText(this, "Enter valid number",Toast.LENGTH_SHORT).show()
        }
    }

    fun multiply(){
        if (firstNumber.text.toString().isNotEmpty() && secondNumber.text.toString().isNotEmpty()){

            val result = firstNumber.text.toString().toFloat() * secondNumber.text.toString().toFloat()
            val intent =  Intent (this, SecondActivity::class.java)
            intent.putExtra("message_key", result.toString())
            startActivity(intent)

        }
        else{
            Toast.makeText(this, "Enter valid number",Toast.LENGTH_SHORT).show()
        }
    }

    fun divide(){
        if (firstNumber.text.toString().isNotEmpty() && secondNumber.text.toString().isNotEmpty()){

            val result = firstNumber.text.toString().toFloat() / secondNumber.text.toString().toFloat()
            val intent =  Intent (this, SecondActivity::class.java)
            intent.putExtra("message_key", result.toString())
            startActivity(intent)

        }
        else{
            Toast.makeText(this, "Enter valid number",Toast.LENGTH_SHORT).show()
        }
    }
}