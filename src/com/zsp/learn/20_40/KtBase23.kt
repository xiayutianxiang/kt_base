package com.zsp.learn.`20_40`


/**
 * Kotlin语言的匿名函数学习
 */
fun main(){
    val len = "Study".count()
    println(len)

    //it等价于 S t u d y S的字符
    val len2 = "StudyS".count(){
        it == 'S'
    }
    println(len2)
}
