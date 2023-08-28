package com.example.appforgym

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.appforgym.databinding.MainActivityBinding

class Main : AppCompatActivity() {
    private lateinit var binding: MainActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainActivityBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

    }
}