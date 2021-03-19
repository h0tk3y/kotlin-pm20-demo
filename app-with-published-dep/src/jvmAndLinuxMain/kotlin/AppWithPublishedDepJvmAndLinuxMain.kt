package com.h0tk3y.appWithPublishedDep

import com.h0tk3y.lib.*

actual fun appWithPublishedDepCommonMainExpectFun() {
    println("hello pm2.0")
}

fun appWithPublishedDepJvmAndLinuxMainFun() {
    libCommonMainFun()
    libCommonMainExpectFun()
}