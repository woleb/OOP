package com.example.it_wog.oop

//Data Class
data class Spieler (var name : String, var punkte : Int) {

    fun gewinnt(){

        punkte = punkte + 10
    }

}
