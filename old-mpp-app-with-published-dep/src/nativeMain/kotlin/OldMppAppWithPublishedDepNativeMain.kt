package com.h0tk3y.oldMppAppWithPublishedDep

import com.h0tk3y.lib.*
import kotlinx.coroutines.*

fun oldMppAppWithPublishedDepNativeMainFun() {
    libCommonMainFun()
}

fun oldMppAppWithPublishedDepNativeMainUseCoroutines() {
    GlobalScope.launch {
        delay(1000)
        println("Hello")
    }
}