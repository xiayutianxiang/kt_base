package com.zsp.learn.ktrange

/**
 * when 表达式
 */
fun main() {
    val week = 5
    val info = when (week) {
        1 -> "今天还得干活啊"
        2 -> "今天还得干活啊"
        3 -> "今天还得干活啊"
        4 -> "今天还得干活啊"
        5 -> "今天还得干活啊"
        6 -> "今天还得干活啊"
        7 -> "睡一天"
        else -> {
            println("还有周八？")
        }
    }
    println(info)
}