package com.h0tk3y.oldMppAppWithProjectDep

import com.h0tk3y.lib.*

fun oldMppAppWithProjectDepCommonIntegrationTestFun() {
    oldMppAppWithProjectDepCommonMainFun()
    oldMppAppWithProjectDepCommonMainExpectFun()

    libCommonMainFun()
    libCommonMainExpectFun()
}