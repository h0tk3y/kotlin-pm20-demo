package com.h0tk3y.oldMppAppWithPublishedDep

import com.h0tk3y.lib.*

actual fun oldMppAppWithPublishedDepCommonMainExpectFun() {
    println("hello pm2.0")
}

fun oldMppAppWithPublishedDepJvmAndLinuxMainFun() {
    libCommonMainFun()
    libCommonMainExpectFun()
}