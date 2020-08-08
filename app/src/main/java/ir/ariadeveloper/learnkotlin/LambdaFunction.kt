package ir.ariadeveloper.learnkotlin

fun multiplyTable(start: Int, end: Int, block: (Int, Int) -> Unit, afterFristItr: () -> Unit) {
    for (i in start to end) {
        for (j in start to end) {
            block(i, j)
        }
        afterFristItr()
    }
}