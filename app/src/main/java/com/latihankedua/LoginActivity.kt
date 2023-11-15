package com.latihankedua
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.latihankedua.databinding.ActivityLoginLinearBinding

class LoginActivity: AppCompatActivity() {
    lateinit var email:String
    lateinit var password:String
    lateinit var binding:ActivityLoginLinearBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginLinearBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnLogin.setOnClickListener {
            email = binding.etEmail.text.toString()
            password = binding.etPassword.text.toString()
            Log.d("PRINT-LOG", email )


            if (email.isNullOrEmpty() || password.isNullOrEmpty()){
                Toast.makeText(applicationContext, "Ups ... !! Email atau Password masih kosong", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(applicationContext, "Sukses !! Anda sudah memasukan Email dan Password", Toast.LENGTH_SHORT).show()
            }
        }
    }
}