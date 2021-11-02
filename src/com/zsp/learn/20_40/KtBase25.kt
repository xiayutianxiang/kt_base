package com.zsp.learn.`20_40`


/**
 * Kotlin语言的函数参数
 */
fun main() {

    //1.函数的输入输出声明 2.函数声明的实现
    val method: (Int, Int, Int) -> String = { number1, number2, number3 ->
        val inputValue = 42312
        "$inputValue 参数一:$number1,参数二：$number2,参数三:$number3"
    }
    println(method(1, 2, 3))
}

/*
fun methodAction(a:Int,b:Int,c:Int):String{
    return "a+b+c=$a+$b+$c"
}*/
