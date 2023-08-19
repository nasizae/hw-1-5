package com.example.hw_1_5

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.hw_1_5.View.CounterView
import com.example.hw_1_5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),CounterView {

    private lateinit var binding: ActivityMainBinding

    var presenter=Presenter(this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initClicker()
    }

    private fun initClicker() {
        with(binding) {
            btnIncrement.setOnClickListener {
                presenter.increment()
            }
            btnDecrement.setOnClickListener {
                presenter.decrement()
            }
        }
    }

    override fun showCount(number: Int) {
        binding.tvCounter.text=number.toString()
    }

    override fun showToast() {
        Toast.makeText(this, "Поздравляем", Toast.LENGTH_SHORT).show()
    }

    override fun saveColor(color: Int) {
        binding.tvCounter.setTextColor(color)
    }


}