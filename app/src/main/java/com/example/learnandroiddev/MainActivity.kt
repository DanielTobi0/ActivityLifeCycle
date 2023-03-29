package com.example.learnandroiddev

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.learnandroiddev.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    class MainActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
        }




        override fun onStart() {
            super.onStart()
            println("On Start called")
        }

        override fun onResume() {
            super.onResume()
            println("On Resume called")
        }

        override fun onPause() {
            super.onPause()
            println("On Pause called")
        }

        override fun onStop() {
            super.onStop()
            println("On Stop called")
        }

        override fun onDestroy() {
            super.onDestroy()
            println("On Destroy called")
        }
    }
}


