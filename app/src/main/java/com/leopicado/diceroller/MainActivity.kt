package com.leopicado.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

import com.leopicado.diceroller.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var diceImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        diceImage = binding.imageviewDice
        binding.buttonRoll.text = "Let's Roll"
        binding.buttonRoll.setOnClickListener {
            rollDice()
        }

        setContentView(binding.root)
    }

    private fun rollDice() {
        val number = (1..6).random().toString()
        diceImage.setImageResource(
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
