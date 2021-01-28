package it.unibo.testAction

class MainClass {
    val hello: String
        get() {
            return "Hello world!!"
        }
}

fun main() {
    println(MainClass().hello)
}
