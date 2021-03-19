package com.h0tk3y.appWithProjectDep

import com.h0tk3y.lib.*

fun appWithProjectDepCommonIntegrationTestFun() {
    appWithProjectDepCommonMainFun()
    appWithProjectDepCommonMainExpectFun()

    libCommonMainFun()
    libCommonMainExpectFun()
}