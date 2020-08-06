package ir.ariadeveloper.learnkotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import io.reactivex.rxjava3.core.Flowable
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.Single
import io.reactivex.rxjava3.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_main.*
import java.util.concurrent.atomic.AtomicInteger


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textview.text = max(10, 30, 20).toString()
        textview.text = sum(10, 30, 20).toString()
        textview.text = average(1.5, 2.8, 2.0).formatted(1, 10)

        "s".println()
        5.0.println()


        var sum = 0
        (1..10).action {
            sum += it
            textview.text = sum.toString()
        }
    }

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

    fun Double.formatted(fix: Int, float: Int): String {
        return String.format("%${fix + float}.${float}f", this)
    }

}