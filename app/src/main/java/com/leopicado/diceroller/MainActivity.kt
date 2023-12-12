package com.leopicado.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
//import com.leopicado.diceroller.databinding.ActivityMainBinding

//private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        binding = ActivityMainBinding.inflate(layoutInflater)
//        binding.buttonRoll.text = "Let's Roll"
//        val view = binding.root
//        setContentView(view)
        val buttonRoll = findViewById<Button>(R.id.button_roll)
//        buttonRoll.text = "Let's Roll"
        setContentView(R.layout.activity_main)
    }
}
