package com.h0tk3y.lib

import kotlinx.coroutines.*

actual fun libCommonMainExpectFun() {
    libCommonMainFun()
}

fun libIosMainFun() {
    libCommonMainExpectFun()
    libCommonMainFun()
}

fun libIosMainUseCoroutines() {
    GlobalScope.launch {
        delay(1000)
        println("Hello")
    }
}