package com.example.maptest

import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.RectF
import android.graphics.Color
import java.util.*

class Pit (x22: Int, y22: Int,cellSize: Int,): Case(x22,y22,cellSize){

    override var color: Int = Color.YELLOW
    override val r: RectF = RectF(x22 - cellSize/2.toFloat(), y22 +cellSize/2.toFloat(), x22 + cellSize/2.toFloat(), y22 - cellSize/2.toFloat())


    override fun draw(canvas: Canvas?) {
        paint.color = color
        canvas?.drawRect(r, paint)
    }

   // override fun reveal(pit: Pit, agent: Agent, canvas: Canvas?) {
        //if ((agent.xPos == xcase && agent.yPos == ycase)) {
          //  pit.draw(canvas)
           // agent.death()


        //}

   // }


}
