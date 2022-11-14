package com.example.android_app.lec03

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.android_app.R

class Start :AppCompatActivity(){
    private lateinit var etView: EditText
    private lateinit var npBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.lec03)
        connector()
    }

    private fun connector()
    {
        try {
            etView = findViewById(R.id.data)
            npBtn = findViewById(R.id.send)

            npBtn.setOnClickListener()
            {
                sendInfo()
            }
        }
        catch (ex:Exception)
        {
            Toast.makeText(this, "Erron in Finding ID ${ex.message}", Toast.LENGTH_SHORT).show()
        }
    }

    private fun sendInfo()
    {
        try {
            if(etView.text.toString().isBlank()){
                Toast.makeText(this,"Should not be Empty!", Toast.LENGTH_SHORT).show()
            }
            else{
                val sendData = etView.text.toString()
                val intent = Intent(this,End::class.java);
                intent.putExtra("key",sendData);
                startActivity(intent);
            }
        }
        catch (ex:Exception)
        {
            Toast.makeText(this,"Something Wrong in Sending INFO ${ex.message}", Toast.LENGTH_SHORT).show()
        }
    }
}