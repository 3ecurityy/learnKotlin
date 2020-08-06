package ir.ariadeveloper.learnkotlin

fun factorial(n: Int): Long {
    if (n == 1) {
        return 1
    }
    return n * factorial(n - 1)
}

fun max(vararg numbers: Int): Int {
    var max = numbers[0]
    for (num in numbers) {
        if (num > max) {
            max = num
        }
    }
    return max
}

fun sum(vararg numbers: Number): Double {
    var sum = 0.0
    for (num in numbers) {
        sum += num.toDouble()
    }
    return sum
}

fun average(vararg numbers: Number): Double {
    var sum = 0.0
    for (num in numbers) {
        sum += num.toDouble()
    }
    val avg = sum / numbers.size
    return avg
}