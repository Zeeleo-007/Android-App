package com.example.android_app.lec02

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.android_app.R


class lec02 : AppCompatActivity(){

    lateinit var firstValue: EditText
    lateinit var secondValue: EditText

    lateinit var calculateBtn: Button
    lateinit var resultTV: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.lec02)
        connector()
    }

    private fun connector()
    {
        try {
            firstValue = findViewById(R.id.First_Value)
            secondValue = findViewById(R.id.Second_value)

            calculateBtn = findViewById(R.id.calculate_btn)
            resultTV = findViewById(R.id.result_tv)

            calculateBtn.setOnClickListener{
                calculateResult()
            }
        }
        catch (ex:java.lang.Exception){
            Toast.makeText(this,"Exception is ${ex.message}",Toast.LENGTH_LONG).show()
        }
    }

    private fun calculateResult(){
        try{
            if(firstValue.text.toString().isBlank())
            {
                Toast.makeText(this, "Please enter the first value", Toast.LENGTH_SHORT).show();
                firstValue.requestFocus()
            }
            else if(secondValue.text.toString().isBlank())
            {
                Toast.makeText(this, "Please enter the second value", Toast.LENGTH_SHORT).show();
                secondValue.requestFocus()
            }
            else
            {
                val val1 = firstValue.text.toString().toInt()
                val val2 = secondValue.text.toString().toInt()

                val result = val1 + val2;
                resultTV.text = "Result: ${result}"
            }
        }
        catch (ex:Exception)
        {
            Toast.makeText(this, "Exception in calResult: ${ex.message}", Toast.LENGTH_SHORT).show();
        }
    }


}