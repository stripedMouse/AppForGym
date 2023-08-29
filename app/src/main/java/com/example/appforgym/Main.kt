package com.example.appforgym

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.appforgym.databinding.MainActivityBinding

class Main : AppCompatActivity() {
    private lateinit var binding: MainActivityBinding
    private var login: String = "Empty"
    private var password: String = "Empty"
    private var name1: String = "Empty"
    private var name2: String = "Empty"
    private var name3: String = "Empty"
    private var : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(requestCode == Constants.REQUEST_CODE_SIGN_UP){

        }else if(requestCode == Constants.REQUEST_CODE_SIGN_UP){

        }
    }

    fun onClickSignIn(view: View){

        val intent = Intent(this, SecondPage::class.java)
        intent.putExtra(Constants.SIGN_STATE, Constants.SIGN_IN_STATE)
        startActivityForResult(intent, Constants.REQUEST_CODE_SIGN_IN)

    }

    fun onClickSignIn(view: View){

        val intent = Intent(this, SecondPage::class.java)
        intent.putExtra(Constants.SIGN_STATE, Constants.SIGN_UP_STATE)
        startActivityForResult(intent, Constants.REQUEST_CODE_SIGN_UP)

    }
}