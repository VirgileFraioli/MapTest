package com.example.maptest

import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.RectF
import android.graphics.Color
import java.util.*

class Wumpus (x222: Int, y222: Int, cellSize: Int): Case(x222,y222,cellSize) {

    override var color: Int = Color.RED
    override val r: RectF = RectF(x222 - cellSize/2.toFloat(), y222 +cellSize/2.toFloat(), x222 + cellSize/2.toFloat(), y222 - cellSize/2.toFloat())

    override fun draw(canvas: Canvas?) {
        paint.color = color
        canvas?.drawRect(r, paint)
    }


    //override fun reveal(wumpus: Wumpus, agent: Agent, canvas: Canvas?) {
        //if (agent.xPos == wumpus.xcase && agent.yPos == wumpus.ycase) {
           // wumpus.draw(canvas)
           // agent.death()


        //}

    //}
    //override fun death (wumpus: Wumpus, agent: Agent,canvas: Canvas?){
       // color = Color.GRAY
      //  wumpus.draw(canvas)
    //}

}

