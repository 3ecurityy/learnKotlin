package ir.ariadeveloper.learnkotlin

fun IntRange.action(block: (Int) -> Unit) {
    for (i in this) {
        block(i)
    }
}

fun String.println() {
    println(this)
}

fun Number.println() {
    println(this)
}