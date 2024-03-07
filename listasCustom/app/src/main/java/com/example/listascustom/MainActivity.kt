package com.example.listascustom

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity(), MyOnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val listFragment = supportFragmentManager.findFragmentById(R.id.FragmentList) as ListFragment
        listFragment.setListener(this)

        Toast.makeText(this, listFragment.returnString(), Toast.LENGTH_LONG).show()
    }

    override fun onClick(juego: Juego) {
        var second = supportFragmentManager?.findFragmentById(R.id.FragmentDetail) as DetailFragment?

        if (second != null) {
            second.UpdateJuego (juego)
        } else {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("juego", juego)
            startActivity(intent)
        }
    }
}