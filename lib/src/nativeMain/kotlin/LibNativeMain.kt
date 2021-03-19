package com.h0tk3y.lib

import kotlinx.coroutines.*

fun libNativeMainFun() {
    libCommonMainFun()
}

fun libNativeMainUseCoroutines() {
    GlobalScope.launch {
        delay(1000)
        println("Hello")
    }
}