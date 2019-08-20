package com.erkuai.mashangkaixuekotlin

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity(), Impl {

    lateinit var hello_text: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var view: View? = null

        view?.setBackgroundColor(Color.RED)

        hello_text = findViewById(R.id.hello_text);
    }

    override fun onResume() {
        super.onResume()
    }

    fun test() {

    }

    fun test2(): Unit {

    }

    var number: Int = 1
    var c: Char = 'c'
    var b: Boolean = true
    var array: IntArray = intArrayOf(1, 2)
    var str: String = "1"

    override fun implFun() {

    }
}
