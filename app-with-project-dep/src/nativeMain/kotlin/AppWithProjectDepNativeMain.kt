package com.h0tk3y.appWithProjectDep

import com.h0tk3y.lib.*
import kotlinx.coroutines.*

fun appWithProjectDepNativeMainFun() {
    libCommonMainFun()
}

fun appWithProjectDepNativeMainUseCoroutines() {
    GlobalScope.launch {
        delay(1000)
        println("Hello")
    }
}