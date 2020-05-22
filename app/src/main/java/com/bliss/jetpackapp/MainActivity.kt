package com.bliss.jetpackapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bliss.jetpackapp.lifecycle.MyObserver

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lifecycle.addObserver(MyObserver()) // 监听activity的生命周期
    }
}
