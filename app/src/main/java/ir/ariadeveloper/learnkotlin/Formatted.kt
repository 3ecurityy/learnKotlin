package ir.ariadeveloper.learnkotlin

fun Number.formatted(fix: Int, float: Int): String {
    return String.format("%${fix + float}.${float}f", this)
}