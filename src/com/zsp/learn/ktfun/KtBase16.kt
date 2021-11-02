package com.zsp.learn.ktfun

/**
 * kotlin语言的函数头学习
 */
fun main(){

}

//函数默认都是public
//现有输入，再有输出
private fun method01(age:Int,name:String):Int{

    println("你的年龄是$age,你的名字是${name}")
    return 20
}

/**
  会转为如下java代码 （在Tools-> Kotlin -> show kotlin ByteCode中查看）
    private static final int method01(int age,String name){
        String var = "你的年龄是"+age+"，你的名字是”+name"
        System.out.println(var)
        return 200;
    }
 */