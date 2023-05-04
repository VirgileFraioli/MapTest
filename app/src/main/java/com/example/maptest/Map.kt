package com.example.maptest

import java.util.*


class Map {



    val EMPTY = 0
    val WALL = 1
    val PIT = 2
    val GOLD = 3
    val WUMPUS = 4

    private val map = arrayOf(
        arrayOf(Cell(WALL), Cell(WALL), Cell(WALL), Cell(WALL), Cell(WALL), Cell(WALL), Cell(WALL), Cell(WALL), Cell(WALL), Cell(WALL)),
        arrayOf(Cell(WALL), Cell(WUMPUS), Cell(EMPTY), Cell(EMPTY), Cell(EMPTY), Cell(EMPTY), Cell(EMPTY), Cell(EMPTY), Cell(EMPTY), Cell(WALL)),
        arrayOf(Cell(WALL), Cell(EMPTY), Cell(PIT), Cell(EMPTY), Cell(EMPTY), Cell(EMPTY), Cell(EMPTY), Cell(EMPTY), Cell(EMPTY), Cell(WALL)),
        arrayOf(Cell(WALL), Cell(EMPTY), Cell(EMPTY), Cell(EMPTY), Cell(EMPTY), Cell(EMPTY), Cell(EMPTY), Cell(EMPTY), Cell(WUMPUS), Cell(WALL)),
        arrayOf(Cell(WALL), Cell(EMPTY), Cell(EMPTY), Cell(EMPTY), Cell(GOLD), Cell(EMPTY), Cell(EMPTY), Cell(EMPTY), Cell(EMPTY), Cell(WALL)),
        arrayOf(Cell(WALL), Cell(EMPTY), Cell(EMPTY), Cell(EMPTY), Cell(EMPTY), Cell(EMPTY), Cell(EMPTY), Cell(WUMPUS), Cell(EMPTY), Cell(WALL)),
        arrayOf(Cell(WALL), Cell(EMPTY), Cell(EMPTY), Cell(EMPTY), Cell(EMPTY), Cell(EMPTY), Cell(EMPTY), Cell(EMPTY), Cell(EMPTY), Cell(WALL)),
        arrayOf(Cell(WALL), Cell(EMPTY), Cell(EMPTY), Cell(EMPTY), Cell(EMPTY), Cell(EMPTY), Cell(EMPTY), Cell(EMPTY), Cell(EMPTY), Cell(WALL)),
        arrayOf(Cell(WALL), Cell(EMPTY), Cell(EMPTY), Cell(EMPTY), Cell(EMPTY), Cell(WUMPUS), Cell(EMPTY), Cell(EMPTY), Cell(EMPTY), Cell(WALL)),
        arrayOf(Cell(WALL), Cell(WALL), Cell(WALL), Cell(WALL), Cell(WALL), Cell(WALL), Cell(WALL), Cell(WALL), Cell(WALL), Cell(WALL))
    )





    lateinit var drawingView: DrawingView

    fun getMap(): Array<Array<Cell>> {
        // Create a new map array to hold the visible cells
        val visibleMap = Array(map.size) { row ->
            Array(map[row].size) { col ->
                map[row][col].copy() // Make a copy of each cell to avoid modifying the original map
            }
        }



        // Mark the cells that have been visited as visible
        // Here, we assume that the player has a variable called "playerPosition"
        visibleMap[drawingView.Agent.x][drawingView.Agent.y].isVisible = true

        // Return the visible map
        return visibleMap
    }
}