package com.zsp.learn.`20_40`


/**
 * Kotlin语言 lambda学习
 */
fun main() {
    val addResultMethod={ number1:Int,number2:Int ->
        "两数相加结果是${number1+number2}"
    }

    println(addResultMethod(1, 53))

    //匿名函数 : 入参 Int 返回 没有明确类型 (Any)
    //lambda表达式         参数 Int，lambda表达式的结果Any类型
    val weekResultMethod = { number:Int ->
        when(number) {
            1 -> println("星期一")
            2 -> println("星期2")
            3 -> println("星期3")
            4 -> println("星期4")
            5 -> println("星期5")
            else -> -1
        }
    }
    println(weekResultMethod(123))

    //匿名函数 属于 lambda
}
