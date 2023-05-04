package com.example.maptest


import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.RectF




class Gold(x22: Int, y22: Int, cellSize: Int) : Case(x22, y22, cellSize) {
    override var color: Int = Color.YELLOW

    override val r: RectF = RectF(x22 - cellSize/2.toFloat(), y22 +cellSize/2.toFloat(), x22 + cellSize/2.toFloat(), y22 - cellSize/2.toFloat())

    override fun draw(canvas: Canvas?) {
        paint.color = color
        canvas?.drawRect(r, paint)
    }
}

    //fun getgrabbed(canvas: Canvas?){
       // if ((drawingView.Agent.x == xcase && drawingView.Agent.y == ycase)) {
            //if (color == Color.YELLOW){
              //  color = Color.GRAY
             //   gold.draw(canvas)
           // }


