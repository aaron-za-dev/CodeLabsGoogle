package com.aaronzadev.codelabsgoogle

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    // use late init to avoid use the nullable operator ? and ensure to init the view on onCreate() method
    lateinit var imgDiceOne : ImageView
    lateinit var imgDiceTwo : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imgDiceOne = findViewById(R.id.imgDiceOne)
        imgDiceTwo = findViewById(R.id.imgDiceTwo)

        val btnRoll : Button = findViewById(R.id.btnRoll)
        btnRoll.setOnClickListener { rollDices() }


    }

    private fun rollDices() {

        Toast.makeText(this, "Rolling the dices! :D", Toast.LENGTH_SHORT).show()

        imgDiceOne.setImageResource(getRandomImageDice())
        imgDiceTwo.setImageResource(getRandomImageDice())

    }

    private fun getRandomImageDice () : Int {

        val result = Random.nextInt(6)+1

        return when(result){

            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6

        }

    }



}
