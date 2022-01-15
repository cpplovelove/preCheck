package com.example.precheck

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.precheck.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater);
        setContentView(binding.root);
    }

    fun tempFunction() {
        var binding = ActivityMainBinding.inflate(layoutInflater);

    }
}