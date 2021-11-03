package com.zsp.learn.`20_40`


/**
 * Kotlin语言 匿名函数的类型推断
 */
fun main() {
    //匿名函数,类型推断为String
    //方法名  必须指定 参数类型和返回类型
    //方法名 = 类型推断返回类型
    val method1 = { v1: Double, v2: Float, v3: Int ->
        //true  //推断为Boolean类型的返回值
        //5123  //推断为Int类型的返回值
        //.....
        "v1:$v1,v2:$v2,v3:$v3"
    }

    println(method1(4512.1,24123.132f,455))

    val method2 = {
        354.3f
    }   //method2 函数:() -> Unit
    println(method2())

    val method3 = {number:Int ->
        number
    }   //相当于入参是Int，返回也是Int类型
    println(method3(56))
}
