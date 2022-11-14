package com.example.android_app.lec03

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import android.widget.Toast
import com.example.android_app.R

class End : AppCompatActivity(){
    private lateinit var txtView:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.endoutput)
        connect()
    }
    private fun connect()
    {
        try {
            txtView = findViewById(R.id.text_view)
            val data = intent.getStringExtra("key")
            txtView.text = data
        }
        catch (ex:Exception)
        {
            Toast.makeText(this, "Error Text View ${ex.message}",Toast.LENGTH_SHORT).show()
        }
    }
}