package com.h0tk3y.lib

import kotlin.test.*
import kotlinx.coroutines.*

class LibCommonTestClass {
    @Test
    fun test() {
        libCommonMainFun()
        libCommonMainExpectFun()
    }
}

fun libCommonTestUseCoroutines() {
    fun useCoroutines() {
        GlobalScope.launch {
            delay(1000)
            println("Hello")
        }
    }
}