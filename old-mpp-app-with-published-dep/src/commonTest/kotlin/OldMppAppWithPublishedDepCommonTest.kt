package com.h0tk3y.oldMppAppWithPublishedDep

import com.h0tk3y.lib.*
import kotlin.test.*
import kotlinx.coroutines.*

class oldMppAppWithPublishedDepCommonTestClass {
    @Test
    fun test() {
        oldMppAppWithPublishedDepCommonMainFun()
        oldMppAppWithPublishedDepCommonMainExpectFun()

        libCommonMainFun()
        libCommonMainExpectFun()
    }
}

fun oldMppAppWithPublishedDepCommonTestUseCoroutines() {
    fun useCoroutines() {
        GlobalScope.launch {
            delay(1000)
            println("Hello")
        }
    }
}