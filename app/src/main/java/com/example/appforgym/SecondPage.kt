package com.example.appforgym

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import com.example.appforgym.databinding.ActivitySecondPageBinding

class SecondPage : AppCompatActivity() {
    private lateinit var binding: ActivitySecondPageBinding
    private val signState = intent.getStringExtra(Constants.SIGN_STATE)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondPageBinding.inflate(layoutInflater)
        setContentView(binding.root)


        if(signState == Constants.SIGN_IN_STATE){

            binding.edName1.visibility = View.GONE
            binding.edName2.visibility = View.GONE
            binding.edName3.visibility = View.GONE
            binding.bAvatar.visibility = View.INVISIBLE

        }
    }
    fun onClickAvatar(view: View) {

        binding.imAvatar.visibility = View.VISIBLE

    }

    fun onClickDone(view: View) {

        if(signState == Constants.SIGN_UP_STATE){

            val intent = Intent()
            intent.putExtra(Constants.LOGIN,binding.edLogin.text.toString())
            intent.putExtra(Constants.PASSWORD,binding.edPassword.text.toString())
            intent.putExtra(Constants.NAME1,binding.edName1.text.toString())
            intent.putExtra(Constants.NAME2,binding.edName2.text.toString())
            intent.putExtra(Constants.NAME3,binding.edName3.text.toString())
            if(binding.imAvatar.isVisible)intent.putExtra(Constants.AVATAR_ID,R.drawable.avatar)
            setResult(RESULT_OK, intent)
            finish()

        }else if(signState == Constants.SIGN_IN_STATE) {

            intent.putExtra(Constants.LOGIN, binding.edLogin.text.toString())
            intent.putExtra(Constants.PASSWORD, binding.edPassword.text.toString())
            setResult(RESULT_OK, intent)

        }

    }
}