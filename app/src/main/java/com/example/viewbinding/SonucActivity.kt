package com.example.viewbinding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewbinding.databinding.ActivitySonucBinding

class SonucActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySonucBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySonucBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.sonuc.setText(getIntent().getExtras()!!.getString("veri"))
        binding.buttonYeni.setOnClickListener {
            val intent = Intent(this@SonucActivity,SecimActivity::class.java)
            startActivity(intent)
        }
    }
}