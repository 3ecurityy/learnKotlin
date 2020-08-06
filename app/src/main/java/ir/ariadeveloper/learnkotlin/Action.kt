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

fun cont(start: Int, to: Int) {
    var range: IntProgression
    if (start < to) {
        range = start to to
    } else {
        range = start downTo to
    }
    for (i in range) {
        println(i)
    }
}