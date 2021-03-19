package com.h0tk3y.appWithPublishedDep

import com.h0tk3y.lib.*
import kotlinx.coroutines.*

actual fun appWithPublishedDepCommonMainExpectFun() {
    appWithPublishedDepCommonMainFun()
    libCommonMainFun()
}

fun appWithPublishedDepIosMainFun() {
    appWithPublishedDepCommonMainExpectFun()
    appWithPublishedDepCommonMainFun()
    libCommonMainExpectFun()
    libCommonMainFun()
}

fun appWithPublishedDepIosMainUseCoroutines() {
    GlobalScope.launch {
        delay(1000)
        println("Hello")
    }
}