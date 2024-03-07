package com.example.listascustom

import android.content.Intent
import android.os.Bundle
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView
import androidx.fragment.app.Fragment

class ListFragment: Fragment() {

    private lateinit var listener: MyOnClickListener

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view = inflater.inflate(R.layout.fragment_list, container, false)
        var juegos = mutableListOf(Juego("Ace Attorney",150000,R.drawable.attorney),
            Juego("Blasphemous",30000,R.drawable.blasphemous),
            Juego("Celeste",40000,R.drawable.celeste),
            Juego("God of War",300000,R.drawable.gow),
            Juego("Ooblets",2000,R.drawable.ooblets),
            Juego("Resident Evil 2",100000,R.drawable.revil),
            Juego("Stardew Valley",80000,R.drawable.stardew),
            Juego("The Last of Us",200000,R.drawable.tlou),
            Juego("The Legend of Zelda: Minish Cap",20000,R.drawable.tloz),
            Juego("Yakuza: Like a Dragon",15000,R.drawable.yakuza))

        val lstJuegos = view.findViewById(R.id.listJuegos) as ListView
        val adapter = JuegoAdapter(view.context, R.layout.juegos_item, juegos)
        lstJuegos.adapter = adapter

        lstJuegos.onItemClickListener = AdapterView.OnItemClickListener() {
                _,_,i,_ ->

            //val tituloJuego = view.findViewById(R.id.textoJuegoMostrar) as TextView
            //tituloJuego.text = juegos[i].nombre
            //SendJuego(juegos[i])
            listener.onClick(juegos[i])

            //val imgJuego = view.findViewById(R.id.imgJuegoMostrar) as ImageView
            //imgJuego.setImageResource(juegos[i].imagen)
        }

        return view
    }



    /*fun SendJuego (juego: Juego) {
        var second = activity?.supportFragmentManager?.findFragmentById(R.id.FragmentDetail) as DetailFragment

        if (second != null) {
            second.UpdateJuego (juego)
        } else {
            val intent = Intent(activity, SecondActivity::class.java)
            intent.putExtra("juego", juego)
            startActivity(intent)
        }
    }*/

    fun setListener(listen: MyOnClickListener?) {
        if (listen != null) {
            listener = listen
        }
    }

    fun returnString() : String{
        return "hola"

    }
}