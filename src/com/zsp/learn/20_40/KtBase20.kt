package com.zsp.learn.`20_40`

// TODO Kotlin 语言的Nothing类型特点
fun main(){
    show(666)
}

private fun show(number:Int){
    when(number){
        in 0..59 -> println("不及格")
        in 60..70 -> println("分数及格")
        in 71..100 -> println("分数优秀")
        else -> println("没有这种分数")
    }
}

interface A{
    fun sho()
}
class Aimpl : A{
    override fun sho() {
        //这句话不是注释提示，会终止程序
        TODO("Not yet implemented")
    }
}