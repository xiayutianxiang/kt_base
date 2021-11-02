package com.zsp.learn.ktrange

/**
 * kotlin语言的String模板
 *      直接拼接，$符号 字符串用{}包裹，数字不用
 */
fun main(){

    val garden = "花园"
    val time = 6

    println("今天天气很好，去${garden}玩，玩了${time}小时")

    //kt的if是表达式，所以更灵活，java的if是语句
    val isLogin = true
    println("${if (isLogin) "登陆成功" else "登陆失败"}")
}