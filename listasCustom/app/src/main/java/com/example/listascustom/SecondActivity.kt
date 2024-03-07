package com.example.listascustom

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val intent = getIntent()
        val mijuego = intent.extras?.getSerializable("juego") as Juego

        var manager = supportFragmentManager
        var fragment = manager.findFragmentById(R.id.FragmentDetail) as DetailFragment


        fragment.UpdateJuego(mijuego)

    }
}