package com.zsp.learn

/**
 * kt的语言类型判断
 */
fun main(){
    //显示给定的类型在这里是多余的
    val info:String = "siuydfbjksd"
    println(info)

    val age = 60
    val bl = true
    val num1 = 1254.4f
    val num2 = 56.4
    println(age.javaClass)
    println(bl.javaClass)
    println(num1.javaClass)
    println(num2.javaClass)
}