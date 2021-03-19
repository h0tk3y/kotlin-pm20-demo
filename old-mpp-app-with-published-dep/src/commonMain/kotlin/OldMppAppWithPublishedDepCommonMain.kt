package com.h0tk3y.oldMppAppWithPublishedDep

import kotlinx.coroutines.*
import com.h0tk3y.lib.*
import com.github.h0tk3y.betterParse.grammar.*
import com.github.h0tk3y.betterParse.parser.*
import com.github.h0tk3y.betterParse.lexer.*
import com.github.h0tk3y.betterParse.combinators.*

expect fun oldMppAppWithPublishedDepCommonMainExpectFun(): Unit

fun oldMppAppWithPublishedDepCommonMainFun() {
    println("Hello PM2.0")
}

fun oldMppAppWithPublishedDepCommonMainUseCoroutines() {
    GlobalScope.launch {
        delay(1000)
        println("Hello")
    }
}

class oldMppAppWithPublishedDepGrammar : Grammar<Unit>() {
    val unit by literalToken("unit")
    override val rootParser by unit.asJust(Unit)
}
