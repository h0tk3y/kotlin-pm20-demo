package com.h0tk3y.oldMppAppWithPublishedDep

import com.h0tk3y.lib.*

fun oldMppAppWithPublishedDepCommonIntegrationTestFun() {
    oldMppAppWithPublishedDepCommonMainFun()
    oldMppAppWithPublishedDepCommonMainExpectFun()

    libCommonMainFun()
    libCommonMainExpectFun()
}