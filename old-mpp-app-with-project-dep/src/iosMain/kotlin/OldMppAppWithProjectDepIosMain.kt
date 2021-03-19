package com.h0tk3y.oldMppAppWithProjectDep

import com.h0tk3y.lib.*
import kotlinx.coroutines.*

actual fun oldMppAppWithProjectDepCommonMainExpectFun() {
    oldMppAppWithProjectDepCommonMainFun()
    libCommonMainFun()
}

fun oldMppAppWithProjectDepIosMainFun() {
    oldMppAppWithProjectDepCommonMainExpectFun()
    oldMppAppWithProjectDepCommonMainFun()
    libCommonMainExpectFun()
    libCommonMainFun()
}

fun oldMppAppWithProjectDepIosMainUseCoroutines() {
    GlobalScope.launch {
        delay(1000)
        println("Hello")
    }
}