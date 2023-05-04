package com.example.maptest

class Cell(val type: Int, var isVisible: Boolean = false) {
    // Define a copy method that returns a new instance of the Cell class
    fun copy(): Cell {
        return Cell(this.type, this.isVisible)
    }
}
