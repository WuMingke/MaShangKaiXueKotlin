package com.erkuai.mashangkaixuekotlin

/**
 * Created by Administrator on 2019/8/21.
 *
 * 饿汉式单例，线程安全
 */
object SingleInstance {
    const val num: Int = 1
    fun method() {
        println("单例方法")
    }
}