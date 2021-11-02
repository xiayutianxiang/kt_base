package com.zsp.learn

/**
 *kotlin预语言的引用类型学习
 *      java中有两种数据类型
 *        基本数据类型：int double boolean等
 *        引用数据类型：String 等
 *      kotlin只有一种数据类型，看起来是引用类型，但实际上
 *          编译器会在Java字节码中将其修改为基本类型
 *
 */

fun main(){
    val age:Int =99 //引用类型
    val pi:Float = 3.1212f
    val pi2:Double = 3.123
    val isOk:Boolean = true
}