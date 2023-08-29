package com.example.appforgym

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.appforgym.databinding.ActivitySecondPageBinding

class SecondPage : AppCompatActivity() {
    private lateinit var binding: ActivitySecondPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondPageBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}