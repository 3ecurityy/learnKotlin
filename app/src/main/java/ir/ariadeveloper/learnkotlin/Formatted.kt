package ir.ariadeveloper.learnkotlin

fun Double.formatted(fix: Int, float: Int): String {
    return String.format("%${fix + float}.${float}f", this)
}