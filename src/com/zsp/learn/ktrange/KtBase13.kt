package com.zsp.learn.ktrange

/**
 *   range 范围 从哪里到哪里
 */
fun main(){
    val number = 148

    if(number in 10..59){
        println("不及格")
    }else if(number in 0..9){
        println("很差")
    }else if(number in 60..100){
        println("及格")
    }else if(number !in 0..100){
        println("分数出错啦")
    }
}