package com.example.maptest


import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Rect
import android.util.AttributeSet
import android.view.SurfaceView



class DrawingView @JvmOverloads constructor (context: Context, attributes: AttributeSet? = null, defStyleAttr: Int = 0): SurfaceView(context, attributes,defStyleAttr) {

    //création de  l'objet Agent

    var x = 1
    var y = 1
    var angle = 0
    var arrow = 10
    var Agent = Agent(x,y,angle)
    val backgroundPaint = Paint()

    val completeMap = Map()
    val map = completeMap.getMap()
    val EMPTY = completeMap.EMPTY
    val GOLD = completeMap.GOLD
    val WALL = completeMap.WALL
    val WUMPUS = completeMap.WUMPUS
    val PIT = completeMap.PIT

    var canvas: Canvas? = null
        private set
    var cellSize: Int = 0
        private set

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        // Get the size of the view
        val viewWidth = width
        val viewHeight = height

        //This will make cellSize equal to the smaller of cellWidth
        // and cellHeight. Then, you can use cellSize for both the width and height of each cell:


        val cellSize = Math.min(viewWidth / map[0].size, viewHeight / map.size)

        // Draw each cell in the grid
        for (y in 0 until map.size) {
            for (x in 0 until map[0].size) {
                val cellType = map[y][x]

                //create a square case using cellzise for the width and lenght of a case
                val cellRect = Rect(x * cellSize, y * cellSize, (x + 1) * cellSize, (y + 1) * cellSize)

                //make a demarcation between the cases
                val borderPaint = Paint().apply {
                    color = Color.BLACK
                    style = Paint.Style.STROKE
                    strokeWidth = 2f
                }
                if (canvas != null) {
                    canvas.drawRect(cellRect, borderPaint)
                }

                //update the position x,y of agent
                var x = Agent.x
                var y = Agent.y
                var angle = Agent.angle

                // Draw the hero
                Agent.draw(canvas, cellSize,x,y, angle )


            }

        }
    }
}
