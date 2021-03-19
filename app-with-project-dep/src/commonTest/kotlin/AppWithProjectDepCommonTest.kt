package com.h0tk3y.appWithProjectDep

import com.h0tk3y.lib.*
import kotlin.test.*
import kotlinx.coroutines.*

class AppWithProjectDepCommonTestClass {
    @Test
    fun test() {
        appWithProjectDepCommonMainFun()
        appWithProjectDepCommonMainExpectFun()

        libCommonMainFun()
        libCommonMainExpectFun()
    }
}

fun AppWithProjectDepCommonTestUseCoroutines() {
    fun useCoroutines() {
        GlobalScope.launch {
            delay(1000)
            println("Hello")
        }
    }
}