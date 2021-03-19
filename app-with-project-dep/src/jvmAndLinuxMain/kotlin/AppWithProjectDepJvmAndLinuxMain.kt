package com.h0tk3y.appWithProjectDep

import com.h0tk3y.lib.*

actual fun appWithProjectDepCommonMainExpectFun() {
    println("hello pm2.0")
}

fun appWithProjectDepJvmAndLinuxMainFun() {
    libCommonMainFun()
    libCommonMainExpectFun()
}