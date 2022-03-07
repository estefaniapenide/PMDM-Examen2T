package com.example.penide_estefania_examen2tadultos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.penide_estefania_examen2tadultos.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonBottomNav.setOnClickListener{startActivity(Intent(this,BottomNavigationActivity::class.java))}
        binding.buttonNavDraw.setOnClickListener { startActivity(Intent(this,NavigationDrawerActivity::class.java)) }
    }
}