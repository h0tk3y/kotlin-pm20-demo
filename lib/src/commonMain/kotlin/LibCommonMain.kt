package com.h0tk3y.lib

import kotlinx.coroutines.*
import com.github.h0tk3y.betterParse.grammar.*
import com.github.h0tk3y.betterParse.parser.*
import com.github.h0tk3y.betterParse.lexer.*
import com.github.h0tk3y.betterParse.combinators.*

expect fun libCommonMainExpectFun(): Unit

fun libCommonMainFun() {
    println("Hello PM2.0")
}

fun libCommonMainUseCoroutines() {
    GlobalScope.launch {
        delay(1000)
        println("Hello")
    }
}

class LibGrammar : Grammar<Unit>() {
    val unit by literalToken("unit")
    override val rootParser by unit.asJust(Unit)
}
