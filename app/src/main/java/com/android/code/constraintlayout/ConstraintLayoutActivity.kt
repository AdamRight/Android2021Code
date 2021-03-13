package com.android.code.constraintlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintSet
import androidx.transition.TransitionManager
import com.android.code.R
import kotlinx.android.synthetic.main.activity_circular_reveal.*

class ConstraintLayoutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //setContentView(R.layout.activity_constraint_layout)
        setContentView(R.layout.activity_circular_reveal)

        favorite.setOnClickListener {
            placeholder.setContentId(R.id.favorite)
        }

        changeView.setOnClickListener {
            val constraintSet = ConstraintSet().apply {
                isForceId = false
                clone(this@ConstraintLayoutActivity,
                    R.layout.activity_circular_reveal2
                )
            }
            TransitionManager.beginDelayedTransition(parentBegin)
            constraintSet.applyTo(parentBegin)
        }
    }
}