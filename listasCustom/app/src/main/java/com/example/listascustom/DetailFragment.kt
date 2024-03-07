package com.example.listascustom

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment

class DetailFragment: Fragment() {
    lateinit var myView: View

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        myView = inflater.inflate(R.layout.fragment_detail, container, false)

        return myView
    }



    fun UpdateJuego (juego: Juego) {
        val tituloJuego = myView.findViewById<TextView>(R.id.textoJuegoMostrar)
        tituloJuego.text = juego.nombre
        val imgJuego = myView.findViewById<ImageView>(R.id.imgJuegoMostrar)
        imgJuego.setImageResource(juego.imagen)
    }

    fun ReturnJuego (juego: Juego) : Juego{

        return juego
    }
}