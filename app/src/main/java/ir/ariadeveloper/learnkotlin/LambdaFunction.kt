package ir.ariadeveloper.learnkotlin

fun multiplyTable(start: Int, end: Int, block: (Int, Int) -> Unit, afterFristItr: () -> Unit) {
    for (i in start to end) {
        for (j in start to end) {
            block(i, j)
        }
        afterFristItr()
    }
}

fun connect(
    url: String = "https://sampleApi.com",
    port: Int = 21,
    timeOut: Long = 1000L * 3,
    onSuccess: () -> Unit = {},
    onFaild: (Int) -> Unit = {}
): Boolean {
    println(url)
    println(port)
    println(timeOut)
    var result = -1

    if (result < 0) {
        onFaild(result)
    } else {
        onSuccess()
    }

    return true
}