package com.erkuai.mashangkaixuekotlin

import android.view.View

/**
 * Created by Administrator on 2019/8/20.
 */
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

}