package com.example.numberincreaser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val viewModel = ViewModelProvider(this).get(MainViewModel::class.java)




        buttonadd.setOnClickListener {
            viewModel.curruntNumber.value = viewModel.num++

        }

        viewModel.curruntNumber.observe(this, Observer {
            textView.text = it.toString()
        })

    }
}