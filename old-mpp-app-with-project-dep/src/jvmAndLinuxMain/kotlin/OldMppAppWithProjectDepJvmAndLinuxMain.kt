package com.h0tk3y.oldMppAppWithProjectDep

import com.h0tk3y.lib.*

actual fun oldMppAppWithProjectDepCommonMainExpectFun() {
    println("hello pm2.0")
}

fun oldMppAppWithProjectDepJvmAndLinuxMainFun() {
    libCommonMainFun()
    libCommonMainExpectFun()
}