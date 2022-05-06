package com.example.viewbinding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.viewbinding.databinding.ActivitySecimBinding

class SecimActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecimBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecimBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.Siparis.setOnClickListener{
            val intent = Intent(this@SecimActivity,SonucActivity::class.java)
            intent.putExtra("veri",binding.KahveSec.getText().toString())
            if (binding.KahveSec.getText().toString() == "" || binding.KahveSec.getText().toString() == " " ){
                Toast.makeText(applicationContext, "Kahve Seçimi Boş Olamaz", Toast.LENGTH_LONG).show()
            }else{
                startActivity(intent)
            }
        }
    }
}