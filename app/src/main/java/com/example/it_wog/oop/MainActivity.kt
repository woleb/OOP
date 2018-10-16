package com.example.it_wog.oop

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //initializing
        var spieler1 : Spieler = Spieler (name =  "Thomas", punkte =  0)
        var spieler2 : Spieler = Spieler(name = "Hanna" , punkte = 0)

        //spieler2.punkte = 44

        //var text = "Spieler ${spieler1.name} hat ${spieler1.punkte}, ${spieler2.name} hat ${spieler2.punkte}"
        //textfeld.text=text

        //Spieler1 button
        button1.setOnClickListener {

            spieler1.gewinnt()

            var text = "Spieler ${spieler1.name} hat ${spieler1.punkte}, ${spieler2.name} hat ${spieler2.punkte}"
            textfeld.text = text
        }

        //Spieler2 button
        button2.setOnClickListener {

            spieler2.gewinnt()

            var text = "Spieler ${spieler1.name} hat ${spieler1.punkte}, ${spieler2.name} hat ${spieler2.punkte}"
            textfeld.text = text
        }

    }
}
