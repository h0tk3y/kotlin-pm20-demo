package com.h0tk3y.oldMppAppWithProjectDep

import com.h0tk3y.lib.*
import kotlinx.coroutines.*

fun oldMppAppWithProjectDepNativeMainFun() {
    libCommonMainFun()
}

fun oldMppAppWithProjectDepNativeMainUseCoroutines() {
    GlobalScope.launch {
        delay(1000)
        println("Hello")
    }
}