package com.zsp.learn.`20_40`


/**
 * Kotlin语言 在函数中定义参数是函数的函数
 *
 * 模拟：数据库SqlServer
 */

const val USER_NAME_SAVE_DB = "zsp"
const val USER_PWD_SAVE_DB = "123456"

fun main() {
    loginAPI("zsp","123456"){msg:String,code:Int ->
        println("最终登录结果：msg:${msg},code:$code")
    }
}


//登录API 模仿 前端
fun loginAPI(userName:String,userPwd:String,responseResult:(String,Int)->Unit){
    if(userName == null || userPwd == null){
        TODO("用户名或者密码为null")    //出现问题，终止程序
    }

    //做校验
    if(userName.length>=3 && userPwd.length>=3){
        if(webServiceLoginApi(userName,userPwd)){
                //登陆成功的逻辑处理
            responseResult("成功",200)
        }else{
            //失败的逻辑处理
            responseResult("失败",400)
        }
    }else{
        //TODO("用户名或者密码不合格")
    }
}

//登录API暴露者 服务器
private fun webServiceLoginApi(name:String,pwd:String):Boolean{
    /*if(name == USER_NAME_SAVE_DB && pwd == USER_NAME_SAVE_DB){
        return true
    }else{
        return false
    }*/
    return name == USER_NAME_SAVE_DB && pwd == USER_PWD_SAVE_DB
}