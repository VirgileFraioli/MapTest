package com.example.maptest

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.RectF

class Case_vide(x2222: Int, y2222: Int, cellSize: Int) : Case(x2222, y2222, cellSize) {
    override var color: Int = Color.GRAY
    override val r: RectF = RectF(x2222 - cellSize/2.toFloat(), y2222 +cellSize/2.toFloat(), x2222 + cellSize/2.toFloat(), y2222 - cellSize/2.toFloat())

}