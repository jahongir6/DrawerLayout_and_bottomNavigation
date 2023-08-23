package com.example.navigationdrawerlayout

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.navigationdrawerlayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.meny.setOnClickListener {
            binding.root.open()
        }
        binding.navigation.setNavigationItemSelectedListener {
            when (it.itemId) {
            R.id.home->{
                Toast.makeText(this, "bu home", Toast.LENGTH_SHORT).show()
            }
                R.id.dashboard->{
                Toast.makeText(this, "bu dashboard", Toast.LENGTH_SHORT).show()
            }
                R.id.notifications->{
                Toast.makeText(this, "bu notification", Toast.LENGTH_SHORT).show()
            }
                R.id.profile -> {
                    Toast.makeText(this, "bu profile", Toast.LENGTH_SHORT).show()
                }
            }
            true
        }
        binding.btnNavigation.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.home -> {
                    binding.root.setBackgroundColor(Color.RED)
                }
                R.id.dashboard -> {
                    binding.root.setBackgroundColor(Color.GRAY)

                }
                R.id.profile -> {
                    binding.root.setBackgroundColor(Color.BLUE)
                }
                R.id.notifications -> {
                    binding.root.setBackgroundColor(Color.GREEN)
                }
            }
            true
        }
    }
}