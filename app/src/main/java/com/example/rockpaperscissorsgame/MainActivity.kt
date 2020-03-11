package com.example.rockpaperscissorsgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.view.View
import android.widget.*



class MainActivity : AppCompatActivity() {

    var turn=1
    var choice1=0


    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        //actionBar!!.hide()
        setContentView(R.layout.activity_main)
        val text = findViewById<TextView>(R.id.textView)
        text.setText("Player's 1 turn")

    }

fun onBtnRockClick(view: View){
    when(turn){
    1->{
        choice1=1
        turn=2
        val text = findViewById<TextView>(R.id.textView)
        text.setText("Player's 2 turn")
    }
    2->{

        val text = findViewById<TextView>(R.id.textView)
        text.setText("Player's 1 turn")
        when(choice1){
            1->text.setText("Draw")
            2->text.setText("Player 1 wins")
            3->text.setText("Player 2 wins")
        }
    }}
}
    fun onBtnPaperClick(view: View){
        when(turn){
            1->{
                choice1=2
                turn=2
                val text = findViewById<TextView>(R.id.textView)
                text.setText("Player's 2 turn")
            }
            2->{

                val text = findViewById<TextView>(R.id.textView)
                text.setText("Player's 1 turn")
                when(choice1){
                    1->text.setText("Player 2 wins")
                    2->text.setText("Draw")
                    3->text.setText("Player 1 wins")
                }
            }}
    }

    fun onBtnScissorsClick(view: View){
        when(turn){
            1->{
                choice1=3
                turn=2
                val text = findViewById<TextView>(R.id.textView)
                text.setText("Player's 2 turn")
            }
            2->{


                val text = findViewById<TextView>(R.id.textView)
                text.setText("Player's 1 turn")
                when(choice1){
                    1->text.setText("Player 1 wins")
                    2->text.setText("Player 2 wins")
                    3->text.setText("Draw")
                }
            }}
    }

    fun onBtnClickRestart(view: View){
        choice1=0

        turn=1
        val text = findViewById<TextView>(R.id.textView)
        text.setText("Player`s 1 turn")
    }


}
