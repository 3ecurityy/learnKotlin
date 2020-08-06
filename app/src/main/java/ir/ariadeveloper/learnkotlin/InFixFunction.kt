package ir.ariadeveloper.learnkotlin

import kotlin.math.pow

infix fun Int.to(other: Int): IntRange {
    return this..other
}

infix fun Int.p(other: Int): Int {
    return this.toDouble().pow(other).toInt()
}