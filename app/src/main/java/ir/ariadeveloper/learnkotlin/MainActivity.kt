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

        (1 to 10).action {
            sum += it
            textview.text = sum.toString()
        }
    }
}