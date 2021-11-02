package com.zsp.learn.ktfun

/**
 * kotlin中 具名函数参数
 */
fun main(){
    loginAction(age = 23,username = "下雨天像",userpwd = "44541",phoneNumber = 10086)
}

private fun loginAction(username:String,userpwd:String,phoneNumber:Int,age:Int){
    println("username:${username},userpwd:${userpwd},phoneNumber:$phoneNumber," +
            "age:$age")
}
