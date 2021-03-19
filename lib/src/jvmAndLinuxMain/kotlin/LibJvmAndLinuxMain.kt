package com.h0tk3y.lib

import com.h0tk3y.lib.*

actual fun libCommonMainExpectFun() {
    println("hello pm2.0")
}

fun libJvmAndLinuxMainFun() {
    libCommonMainFun()
    libCommonMainExpectFun()
}