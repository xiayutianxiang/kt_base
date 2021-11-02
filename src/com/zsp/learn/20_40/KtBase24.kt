package com.zsp.learn.`20_40`


/**
 * Kotlin语言的函数类型和隐式返回
 */
fun main(){
    //1.函数输入输出的声明
    val methodACtion : () -> String

    //2.对上面函数实现
    methodACtion = {
        val inputValue =1223

        //匿名函数不写return，最后一行就是返回值
        "$inputValue Study" // == return "$inputValue Study"
    }
}

/*fun methodACtion():String{
    return "Study"
}*/
