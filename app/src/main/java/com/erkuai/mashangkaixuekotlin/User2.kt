package com.erkuai.mashangkaixuekotlin

/**
 * Created by Administrator on 2019/9/2.
 */
class User2 constructor(var name: String) { //主构造器

    init {

    }

    //次构造器调用主构造器
    constructor(name: String, id: Int) : this(name) {

    }

    constructor(name: String, id: Int, age: Int) : this(name, id) {

    }

    //函数简化
    fun area(width: Int, height: Int): Int {
        return width * height
    }

    fun area2(width: Int, height: Int): Int = width * height

    fun area3(width: Int, height: Int) = width * height

    //方法重载
    fun sayHi(name: String = "erKuai") {
        println("Hi:$name")
    }

    fun sayHi() {

    }

    //内部函数
    fun login(name: String, password: String) {
        fun check(value: String) {
            if (value.isEmpty()) {
                throw IllegalArgumentException(value)
            }
        }

        check(name)
        check(password)

    }

    //原生字符串
    val text = """
      Hi $name!
    My name is $name."""



}