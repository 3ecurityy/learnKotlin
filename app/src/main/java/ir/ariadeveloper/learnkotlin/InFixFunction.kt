package ir.ariadeveloper.learnkotlin

infix fun Int.to(other: Int): IntRange {
    return this..other
}