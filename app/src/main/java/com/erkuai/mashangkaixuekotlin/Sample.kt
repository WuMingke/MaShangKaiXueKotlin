package com.erkuai.mashangkaixuekotlin

import android.view.View

/**
 * Created by Administrator on 2019/8/20.
 */

fun topLevelFunction() {

}

class Sample {
    var view: View? = null

    var name = "Qinglie"
        get() {
            return "" + field
        }
        set(value) {
            name = "" + value
        }


    fun run() {
        name = "Erkuai"

        print(name)
    }


    object B {
        const val STATIC_STRING = "STATIC STRING"
    }

    companion object {
        const val STATIC_STRING_2 = "STATIC STRING"

        var num: Int = 2
    }


}