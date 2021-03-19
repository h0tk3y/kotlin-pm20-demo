package com.h0tk3y.appWithProjectDep

import kotlinx.coroutines.*
import com.h0tk3y.lib.*
import com.github.h0tk3y.betterParse.grammar.*
import com.github.h0tk3y.betterParse.parser.*
import com.github.h0tk3y.betterParse.lexer.*
import com.github.h0tk3y.betterParse.combinators.*

expect fun appWithProjectDepCommonMainExpectFun(): Unit

fun appWithProjectDepCommonMainFun() {
    println("Hello PM2.0")
}

fun appWithProjectDepCommonMainUseCoroutines() {
    GlobalScope.launch {
        delay(1000)
        println("Hello")
    }
}

class AppWithProjectDepGrammar : Grammar<Unit>() {
    val unit by literalToken("unit")
    override val rootParser by unit.asJust(Unit)
}
