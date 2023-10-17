package com.example.livedataapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    private lateinit var vm: MainActivityVM
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val text = findViewById<TextView>(R.id.txt1)
        val btn1 = findViewById<Button>(R.id.btnFloat)
        vm = ViewModelProvider(this)[MainActivityVM::class.java]
        btn1.setOnClickListener {
            vm.add(text.text.toString().toInt())
        }
        vm.str.observe(this, Observer {
            text.text = it.toString()
        })
    }
}