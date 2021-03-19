package com.h0tk3y.appWithPublishedDep

import com.h0tk3y.lib.*
import kotlin.test.*
import kotlinx.coroutines.*

class AppWithPublishedDepCommonTestClass {
    @Test
    fun test() {
        appWithPublishedDepCommonMainFun()
        appWithPublishedDepCommonMainExpectFun()

        libCommonMainFun()
        libCommonMainExpectFun()
    }
}

fun AppWithPublishedDepCommonTestUseCoroutines() {
    fun useCoroutines() {
        GlobalScope.launch {
            delay(1000)
            println("Hello")
        }
    }
}