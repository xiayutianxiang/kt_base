package com.zsp.learn.`20_40`

/**
 * kotlin语言中的反引号
 */
fun main(){
    //第一种情况
    `登录功能`("下雨天像","asdasd")
}

private fun `登录功能`(name:String,pwd:String){
    println("模拟：用户名是${name},密码是$pwd")
}