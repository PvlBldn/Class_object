package com.example.class_object

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var user = User("Sergey", "0000", 25)
      //  var user2 = User("Andrey", "121212", 32)
        Log.d("MyLog", user.addAge())
    }
}