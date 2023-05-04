package com.example.maptest


import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.RectF
import android.graphics.Color
import java.util.*


abstract class Case (x2: Int, y2: Int, protected val cellSize: Int) {
    abstract val r: RectF
    val paint = Paint()
    abstract var color: Int

    open fun draw(canvas: Canvas?) {
        paint.color = color
        if (canvas != null) {
            canvas.drawRect(r, paint)
        }
    }
}
