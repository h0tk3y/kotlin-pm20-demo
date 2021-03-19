package com.h0tk3y.oldMppAppWithProjectDep

import com.h0tk3y.lib.*
import kotlin.test.*
import kotlinx.coroutines.*

class OldMppAppWithProjectDepCommonTestClass {
    @Test
    fun test() {
        oldMppAppWithProjectDepCommonMainFun()
        oldMppAppWithProjectDepCommonMainExpectFun()

        libCommonMainFun()
        libCommonMainExpectFun()
    }
}

fun OldMppAppWithProjectDepCommonTestUseCoroutines() {
    fun useCoroutines() {
        GlobalScope.launch {
            delay(1000)
            println("Hello")
        }
    }
}