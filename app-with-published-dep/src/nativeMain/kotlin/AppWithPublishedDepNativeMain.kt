package com.h0tk3y.appWithPublishedDep

import com.h0tk3y.lib.*
import kotlinx.coroutines.*

fun appWithPublishedDepNativeMainFun() {
    libCommonMainFun()
}

fun appWithPublishedDepNativeMainUseCoroutines() {
    GlobalScope.launch {
        delay(1000)
        println("Hello")
    }
}