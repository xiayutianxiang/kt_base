package com.zsp.learn

/**
 * kt的语言编译时常量
 * 编译时常量只能是常用的基本数据类型
 */

//编译时常量只能定义在函数之外，为什么？
// 如果在函数内定义，那么必须在运行时才能被赋值，就不是编译时

const val PI = 23135  //编译时常量
fun main(){
    val a = ""      //只读类型的变量

}