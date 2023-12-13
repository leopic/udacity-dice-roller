package com.leopicado.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

import com.leopicado.diceroller.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // findViewById
//        setContentView(R.layout.activity_main)
//        val buttonRoll = findViewById<Button>(R.id.button_roll)
//        buttonRoll.text = "Let's Roll"

        // viewBinding
        binding = ActivityMainBinding.inflate(layoutInflater)
        binding.buttonRoll.text = "Let's Roll"
        binding.buttonRoll.setOnClickListener {
            Toast.makeText(this, "test", Toast.LENGTH_SHORT).show()
        }
        setContentView(binding.root)
    }
}
