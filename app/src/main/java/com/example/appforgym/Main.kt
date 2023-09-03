package com.example.appforgym

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import com.example.appforgym.databinding.MainActivityBinding

class Main : AppCompatActivity() {
    private lateinit var binding: MainActivityBinding
    private var login: String = "Empty"
    private var password: String = "Empty"
    private var name1: String = "Empty"
    private var name2: String = "Empty"
    private var name3: String = "Empty"
    private var imAvatar_id: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(requestCode == Constants.REQUEST_CODE_SIGN_IN){

            val l = data?.getStringExtra(Constants.LOGIN)
            val p = data?.getStringExtra(Constants.PASSWORD)
            if (l == login && p == password){

                binding.imAvatarMain.visibility = View.VISIBLE
                binding.imAvatarMain.setImageResource(imAvatar_id)
                val textMain = "$name1 $name2 $name3"
                binding.tMain.text = textMain

            } else {

                binding.tMain.text = "Такого аккаунта нет"

            }

        }else if(requestCode == Constants.REQUEST_CODE_SIGN_UP){

            login = data?.getStringExtra(Constants.LOGIN)!!
            password = data.getStringExtra(Constants.PASSWORD)!!
            name1 = data.getStringExtra(Constants.NAME1)!!
            name2 = data.getStringExtra(Constants.NAME2)!!
            name3 = data.getStringExtra(Constants.NAME3)!!
            imAvatar_id = data.getIntExtra(Constants.AVATAR_ID,0)
            binding.imAvatarMain.visibility = View.VISIBLE
            binding.imAvatarMain.setImageResource(imAvatar_id)
            val textMain = "$name1 $name2 $name3"
            binding.tMain.text = textMain
            binding.bSignIn.text = "Выйти"
            binding.bSignUp.visibility = View.INVISIBLE

        }
    }

    fun onClickSignIn(view: View){

        val intent = Intent(this, SecondPage::class.java)
        intent.putExtra(Constants.SIGN_STATE, Constants.SIGN_IN_STATE)
        startActivityForResult(intent, Constants.REQUEST_CODE_SIGN_IN)

    }

    fun onClickSignUp(view: View){

        val intent = Intent(this, SecondPage::class.java)
        intent.putExtra(Constants.SIGN_STATE, Constants.SIGN_UP_STATE)
        startActivityForResult(intent, Constants.REQUEST_CODE_SIGN_UP)

    }
}