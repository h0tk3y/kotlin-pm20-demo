import kotlinx.coroutines.*

expect fun f(): Unit

fun commonFun() {
    println("Hello PM2.0")
}

fun useCoroutines() {
    GlobalScope.launch {
        delay(1000)
        println("Hello")
    }
}