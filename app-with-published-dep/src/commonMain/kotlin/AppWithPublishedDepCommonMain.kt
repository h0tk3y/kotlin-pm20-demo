package com.h0tk3y.appWithPublishedDep

import kotlinx.coroutines.*
import com.h0tk3y.lib.*
import com.github.h0tk3y.betterParse.grammar.*
import com.github.h0tk3y.betterParse.parser.*
import com.github.h0tk3y.betterParse.lexer.*
import com.github.h0tk3y.betterParse.combinators.*

expect fun appWithPublishedDepCommonMainExpectFun(): Unit

fun appWithPublishedDepCommonMainFun() {
    println("Hello PM2.0")
}

fun appWithPublishedDepCommonMainUseCoroutines() {
    GlobalScope.launch {
        delay(1000)
        println("Hello")
    }
}

class AppWithPublishedDepGrammar : Grammar<Unit>() {
    val unit by literalToken("unit")
    override val rootParser by unit.asJust(Unit)
}
