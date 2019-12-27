package com.junaid.msgshareapp

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnShowPin.setOnClickListener{
            Log.i("MainActivity","button was click")

            Toast.makeText(this,"button was click",Toast.LENGTH_SHORT).show()

        }
        btnClickHere.setOnClickListener {

            val mass=editTextmsg.text.toString()
            Toast.makeText(this,mass,Toast.LENGTH_SHORT).show()
            val intent=Intent(this,SecondActivity::class.java)
            startActivity(intent)
        }
         btnshareapp.setOnClickListener {
             val mass=editTextmsg.text.toString()
             val intent=Intent()
             intent.action=Intent.ACTION_SEND
             intent.putExtra(Intent.EXTRA_TEXT,mass)
             intent.type="test/plain"
             startActivity(Intent.createChooser(intent,"Share To"))

         }
         btnrecyclerview.setOnClickListener {
            intent=Intent(this,recycleview::class.java)

         }
    }
    }
