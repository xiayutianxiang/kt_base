package com.zsp.learn.`20_40`


/**
 * Kotlin语言 it关键字特点
 */
fun main() {
    val methodAction: (Int, Int, Int) -> String = {
        n1, n2, n3->
        val number = 123
        println("$number,n1:$n1 ,n2:$n2 ,n2:$n3")
        "$number,n1:$n1 ,n2:$n2 ,n2:$n3"
    }
    //和methodAction(1,2,3)等价
    //methodAction.invoke(1,2,3)
    methodAction(1,2,3)

    val method2:(String)->String={
        "$it"
    }
}

/*
fun method2(it:String):String{
    return "$it derry"
}*/
