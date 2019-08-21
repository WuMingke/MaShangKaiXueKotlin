package com.erkuai.mashangkaixuekotlin

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.view.ViewPager
import android.util.Log
import android.view.View
import android.widget.TextView
import java.math.BigDecimal

class MainActivity : AppCompatActivity(), Impl {

    lateinit var hello_text: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var view: View? = null

        view?.setBackgroundColor(Color.RED)

        hello_text = findViewById(R.id.hello_text)


        Sample.B.STATIC_STRING
        Sample.STATIC_STRING_2
        Sample.num

        SingleInstance.num
        SingleInstance.method()

        var listener = object : ViewPager.SimpleOnPageChangeListener() {

            override fun onPageScrollStateChanged(state: Int) {
                super.onPageScrollStateChanged(state)
            }

            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels)
            }

            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
            }
        }


        topLevelFunction()

        var user = User(1, "2")
        var value = user.map["key1"]

        //只读：集合的size不可变，元素值不可变
        //可写
        // var list = user.strs.toMutableList()


        //遍历
        var sequenceOf = sequenceOf("1", "2", "3")


        //作业
        var arrayStartTime = System.currentTimeMillis()
        var array = Array(100000, { it -> it.inc() })
        var sumArray = 0
        for (item in array) {
            sumArray += item
        }
        var arrayAverage = BigDecimal(sumArray).divide(BigDecimal(array.size)).setScale(2, BigDecimal.ROUND_HALF_UP)
        Log.i("Qinglie", "平均值：" + arrayAverage + ",执行时间：" + (System.currentTimeMillis() - arrayStartTime))

        var intArrayStartTime = System.currentTimeMillis()
        var intArray = IntArray(100000, { it -> it.inc() })
        var sumIntArray = 0
        for (item in intArray) {
            sumIntArray += item
        }
        var intArrayAverage = BigDecimal(sumIntArray).divide(BigDecimal(intArray.size)).setScale(2, BigDecimal.ROUND_HALF_UP)
        Log.i("Qinglie", "平均值：" + intArrayAverage + ",执行时间：" + (System.currentTimeMillis() - intArrayStartTime))

        var listStartTime = System.currentTimeMillis()
        var list = List(100000, { it -> it.inc() })
        var sumList = 0
        for (item in list) {
            sumList += item
        }
        var listAverage = BigDecimal(sumList).divide(BigDecimal(list.size)).setScale(2, BigDecimal.ROUND_HALF_UP)
        Log.i("Qinglie", "平均值：" + listAverage + ",执行时间：" + (System.currentTimeMillis() - listStartTime))
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
