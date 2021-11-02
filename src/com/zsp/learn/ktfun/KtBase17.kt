package com.zsp.learn.ktfun

/**
 * kotlin中函数参数的默认函数
 */
fun main(){
    action01("下雨天像",23)
    action02("下雨天像")
}

private fun action01(name:String,age:Int){
    println("我的名字是${name},年龄是$age")
}

private fun action02(name:String,age:Int=77){ //可以直接一个默认值，调用时候可以不去赋值（也可赋值）
    println("我的名字是${name},年龄是$age")
}