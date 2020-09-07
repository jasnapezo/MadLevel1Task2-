package com.example.madlevel1task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.madlevel1task2.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initViews()
    }

    private fun initViews() {
        binding.btnSubmit.setOnClickListener {
            handleClick()
        }
    }

    private fun handleClick() {
        Toast.makeText(this, getString(R.string.correct) + checkAmountInputCorrect(), Toast.LENGTH_SHORT).show()
    }

    private fun checkAmountInputCorrect(): Int {
        var amount = 0

        if (binding.inputFirst.text.toString().toUpperCase(Locale.ROOT).equals("T")) amount++
        if (binding.inputSecond.text.toString().toUpperCase(Locale.ROOT).equals("F")) amount++
        if (binding.inputThird.text.toString().toUpperCase(Locale.ROOT).equals("F")) amount++
        if (binding.inputFourth.text.toString().toUpperCase(Locale.ROOT).equals("F")) amount++

        return amount
    }
}