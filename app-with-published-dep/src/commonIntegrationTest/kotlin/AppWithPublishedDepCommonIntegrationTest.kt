package com.h0tk3y.appWithPublishedDep

import com.h0tk3y.lib.*

fun appWithPublishedDepCommonIntegrationTestFun() {
    appWithPublishedDepCommonMainFun()
    appWithPublishedDepCommonMainExpectFun()

    libCommonMainFun()
    libCommonMainExpectFun()
}