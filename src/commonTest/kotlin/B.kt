import kotlin.test.*
import kotlinx.coroutines.*

class CommonTestClass {
    @Test
    fun test() { }
}

fun h() {
    commonFun()
    f()
    g()
}

fun useCoroutinesInTest() {
    fun useCoroutines() {
        GlobalScope.launch {
            delay(1000)
            println("Hello")
        }
    }
}