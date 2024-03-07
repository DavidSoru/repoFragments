package com.example.listascustom

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class JuegoAdapter (context: Context, val layout: Int, val juegos: MutableList<Juego>) :
    ArrayAdapter<Juego>(context, layout, juegos) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var view: View

        if(convertView != null) {
            view = convertView
        } else {
            view = LayoutInflater.from(getContext()).inflate(layout, parent, false)
        }

        bindJuegos (view, juegos[position])

        return view
    }

    fun bindJuegos (view: View, juego: Juego) {
        val imgJuego = view.findViewById(R.id.imgListJuego) as ImageView
        imgJuego.setImageResource(juego.imagen)

        val tituloJuego = view.findViewById(R.id.nombreJuegoLista) as TextView
        tituloJuego.text = juego.nombre

        val numJugadores = view.findViewById(R.id.numJugadoresLista) as TextView
        numJugadores.text = "Número de jugadores: " + juego.numJugadores

    }
}