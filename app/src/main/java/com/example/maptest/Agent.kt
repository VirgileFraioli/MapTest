package com.example.maptest

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import java.lang.Math.*
import kotlin.math.cos
import kotlin.math.sin


class Agent(var x: Int, var y: Int, var angle : Int) {
    val size = 50
    var arrow = 3
    var points = 12500
    var goldcount = 1


    // Define the color of the hero
    val color = Color.RED

    fun draw(canvas: Canvas, cellSize: Int, x: Int, y: Int, angle: Int) {
        // Calculate the position of the hero in pixels based on its coordinates
        val xPos = x * cellSize + cellSize / 2f
        val yPos = y * cellSize + cellSize / 2f

        // Define the dimensions of the arrow shape
        val arrowWidth = size / 0.4f
        val arrowLength = size * 1.1f

        // Calculate the coordinates of the arrow tip based on the angle
        val tipX = xPos + arrowLength * sin(angle * PI.toFloat() / 180f)
        val tipY = yPos - arrowLength * cos(angle * PI.toFloat() / 180f)

        // Calculate the coordinates of the arrow tail based on the angle
        val tailX1 = xPos + arrowWidth / 2f * sin((angle + 90f) * PI.toFloat() / 180f)
        val tailY1 = yPos - arrowWidth / 2f * cos((angle + 90f) * PI.toFloat() / 180f)
        val tailX2 = xPos + arrowWidth / 2f * sin((angle - 90f) * PI.toFloat() / 180f)
        val tailY2 = yPos - arrowWidth / 2f * cos((angle - 90f) * PI.toFloat() / 180f)

        // Draw the arrow shape using a Path object
        val path = Path()
        path.moveTo(tipX, tipY)
        path.lineTo(tailX1, tailY1)
        path.lineTo(tailX2, tailY2)
        path.close()

        // Draw the arrow as a filled shape
        canvas.drawPath(path, Paint().apply { color = color })
    }

    //fonction permettant de faire bouger l'agent, la fonction prend en argument dx et dy indiquent de combien l'agent doit bouger
    //suivant x ou y si l'on appuie sur un bouton.
    fun update_agent_position(new_angle: Int) {

        var dx = 0
        var dy = 0
        if (new_angle == 0) {
            if (angle == 0) {
                dx = 0
                dy = -1
            }
            if (angle == 90) {
                dx = 1
                dy = 0
            }

            if (angle == 180) {
                dx = 0
                dy = 1
            }
            if (angle == 270) {
                dx = -1
                dy = 0
            }
        }
            x = x + dx
            y = y + dy
            angle = angle + new_angle
            if (angle == 360) {
                angle = 0
            }
            if (angle < 0) {
                angle = angle + 360
            }
        }

        //fonction doit récuperer gold et changer la case en une case blanche

        //fun grab(){
            //if (xPos == gold.xcase && yPos == gold.ycase)){
                //gold.getgrabbed()
               // goldcount = goldcount + 1

            //}




       // fun death(agent: Agent,wumpus: Wumpus,pit: Pit){

        //}









}









