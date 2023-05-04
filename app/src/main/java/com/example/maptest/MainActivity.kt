
package com.example.maptest

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast



class MainActivity : AppCompatActivity() {

    lateinit var Rotate_Left : Button
    lateinit var Rotate_right : Button
    lateinit var Move : Button
    lateinit var drawingView : DrawingView
    lateinit var take : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Rotate_Left = findViewById(R.id.Rotate_Left)
        Rotate_right = findViewById(R.id.Rotate_Right)
        drawingView = findViewById(R.id.drawing_view)
        Move = findViewById(R.id.Move)
        take = findViewById(R.id.Take)

        Rotate_Left.setOnClickListener {
            drawingView.Agent.update_agent_position(-90)
            drawingView.invalidate()}

        Rotate_right.setOnClickListener {
            drawingView.Agent.update_agent_position(90)
            drawingView.invalidate()}

        Move.setOnClickListener {
            drawingView.Agent.update_agent_position(0)
            drawingView.invalidate()}

        //take.setOnClickListener {
        //drawingView.Agent.take_gold(drawingView.map)
        //drawingView.invalidate()}

        drawingView.setWillNotDraw(false)
        drawingView.invalidate()

    }

}
