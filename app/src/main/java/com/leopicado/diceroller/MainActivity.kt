package com.leopicado.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
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
            rollDice(binding)
        }
        setContentView(binding.root)
    }

    private fun rollDice(binding: ActivityMainBinding) {
        val number = (1..6).random().toString()
        binding.imageviewDice.setImageResource(
            when (number) {
                "1" -> R.drawable.dice_1
                "2" -> R.drawable.dice_2
                "3" -> R.drawable.dice_3
                "4" -> R.drawable.dice_4
                "5" -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }
        )
    }
}
