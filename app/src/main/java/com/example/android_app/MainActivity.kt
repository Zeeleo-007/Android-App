package com.example.android_app

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import android.content.Intent
import com.example.android_app.lec02.lec02
import com.example.android_app.lec01.lec01
import com.example.android_app.lec03.Start

class MainActivity : AppCompatActivity() {
    private lateinit var lec1btn:Button
    private lateinit var lec2btn:Button
    private lateinit var lec3btn:Button

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        connector()
    }

    private fun connector()
    {
        try {
            lec1btn = findViewById(R.id.lec_1_btn)
            lec2btn = findViewById(R.id.lec_2_btn)
            lec3btn = findViewById(R.id.lec_3_btn)

            lec1btn.setOnClickListener{
                moveTOLecture1()
            }
            lec2btn.setOnClickListener{
                moveTOLecture2()
            }
            lec3btn.setOnClickListener{
                moveToLecture3()
            }
        }
        catch (ex:Exception)
        {
            Toast.makeText(this, "MainScreen: ${ex.message}", Toast.LENGTH_SHORT).show()
        }
    }

    private fun moveTOLecture2()
    {
        try{
            val objIntent = Intent(this,lec02::class.java)
            startActivity(objIntent)
        }
        catch (ex:Exception)
        {
            Toast.makeText(this, "Exception in lec3-loading: ${ex.message}",Toast.LENGTH_SHORT).show()
        }
    }

    private fun moveTOLecture1()
    {
        try {
            startActivity(Intent(this, lec01::class.java))
        }
        catch (ex:java.lang.Exception)
        {
            Toast.makeText(this, "Exception in lec01-loading: ${ex.message}",Toast.LENGTH_SHORT).show();
        }
    }
    private fun moveToLecture3()
    {
        try {
            startActivity(Intent(this, Start::class.java))
        }
        catch (ex:java.lang.Exception)
        {
            Toast.makeText(this, "Exception in lec01-loading: ${ex.message}",Toast.LENGTH_SHORT).show();
        }
    }
}