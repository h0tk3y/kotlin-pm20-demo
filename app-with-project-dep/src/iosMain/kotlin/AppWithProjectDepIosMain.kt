package com.h0tk3y.appWithProjectDep

import com.h0tk3y.lib.*
import kotlinx.coroutines.*

actual fun appWithProjectDepCommonMainExpectFun() {
    appWithProjectDepCommonMainFun()
    libCommonMainFun()
}

fun appWithProjectDepIosMainFun() {
    appWithProjectDepCommonMainExpectFun()
    appWithProjectDepCommonMainFun()
    libCommonMainExpectFun()
    libCommonMainFun()
}

fun appWithProjectDepIosMainUseCoroutines() {
    GlobalScope.launch {
        delay(1000)
        println("Hello")
    }
}