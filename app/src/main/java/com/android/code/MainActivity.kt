package com.android.code

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.code.constraintlayout.ConstraintLayoutActivity
import com.android.code.motionlayout.MotionLayout1Activity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mConstraintLayout.setOnClickListener {
            startActivity(Intent(this, ConstraintLayoutActivity::class.java))
        }

        mMotionLayout1.setOnClickListener {
            startActivity(Intent(this, MotionLayout1Activity::class.java))
        }
    }
}