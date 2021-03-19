package com.h0tk3y.oldMppAppWithPublishedDep

import com.h0tk3y.lib.*
import kotlinx.coroutines.*

actual fun oldMppAppWithPublishedDepCommonMainExpectFun() {
    oldMppAppWithPublishedDepCommonMainFun()
    libCommonMainFun()
}

fun oldMppAppWithPublishedDepIosMainFun() {
    oldMppAppWithPublishedDepCommonMainExpectFun()
    oldMppAppWithPublishedDepCommonMainFun()
    libCommonMainExpectFun()
    libCommonMainFun()
}

fun oldMppAppWithPublishedDepIosMainUseCoroutines() {
    GlobalScope.launch {
        delay(1000)
        println("Hello")
    }
}