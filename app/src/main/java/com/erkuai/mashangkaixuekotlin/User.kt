package com.erkuai.mashangkaixuekotlin

/**
 * Created by Administrator on 2019/8/21.
 */
class User {
    val id: Int
    val name: String

    companion object {
        init {
            //初始化代码块，先于构造器执行
        }
    }

    /*private*/ constructor(id: Int, name: String) {
        this.id = id
        this.name = name
    }

    fun play(item: String) {
        println(item)
    }

    val strs /*: Array<String>*/ = arrayOf("a", "s", "d")//可省略类型

    var strs2: List<String> = listOf("q")

    val map: Map<String, String> = mapOf("key1" to "value1", "key2" to "value2")

}