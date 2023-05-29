package com.example.fillupcircleanimation

import android.animation.ValueAnimator
import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var circleProgress: CircleProgress

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        circleProgress = findViewById(R.id.donut_progress)
        //circleProgress.setUnfinishedColor(Color.parseColor("#069EDD"))
        circleProgress.setTextColor(Color.parseColor("#FF000000"))
        circleProgress.setFinishedColor(Color.parseColor("#F5483D"))
        circleProgress.max = 100
        val valueAnimator = ValueAnimator.ofInt(0, 100)
        valueAnimator.addUpdateListener { value ->
            circleProgress.setProgress(value.animatedValue as Int)
            circleProgress.setText(value.animatedValue.toString() + "")
        }
        valueAnimator.duration = 3000
        valueAnimator.start()
    }
}
