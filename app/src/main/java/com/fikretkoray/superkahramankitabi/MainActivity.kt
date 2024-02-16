package com.fikretkoray.superkahramankitabi

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.fikretkoray.superkahramankitabi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // Veri Hazırlığı

        var superKahramanIsimleri = ArrayList<String>()
        superKahramanIsimleri.add("Batman")
        superKahramanIsimleri.add("Superman")
        superKahramanIsimleri.add("Iron Man")
        superKahramanIsimleri.add("Aquaman")
        superKahramanIsimleri.add("Spider-Man")

        /*
        //Verimsiz Tanımlama

        val batmanBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.batman)
        val supermanBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.superman)
        val ironmanBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.ironman)
        val aquamanBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.aquaman)
        val spidermanBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.spiderman)

        var superKahramanGorselleri = ArrayList<Bitmap>()
        superKahramanGorselleri.add(batmanBitmap)
        superKahramanGorselleri.add(supermanBitmap)
        superKahramanGorselleri.add(ironmanBitmap)
        superKahramanGorselleri.add(aquamanBitmap)
        superKahramanGorselleri.add(spidermanBitmap)
        */

        // Verimli Tanımlamalar

        val batmanDrawbleId = R.drawable.batman
        val supermanDrawbleId = R.drawable.superman
        val ironmanDrawbleId = R.drawable.ironman
        val aquamanDrawbleId = R.drawable.aquaman
        val spidermanDrawbleId = R.drawable.spiderman

        var superKahramanDrawbleListesi = ArrayList<Int>()
        superKahramanDrawbleListesi.add(batmanDrawbleId)
        superKahramanDrawbleListesi.add(supermanDrawbleId)
        superKahramanDrawbleListesi.add(ironmanDrawbleId)
        superKahramanDrawbleListesi.add(aquamanDrawbleId)
        superKahramanDrawbleListesi.add(spidermanDrawbleId)


        //Adapter

        val layoutManager = LinearLayoutManager(this)
        binding.recyclerView.layoutManager = layoutManager

        val adapter = RecyclerAdapter(superKahramanIsimleri, superKahramanDrawbleListesi )
        binding.recyclerView.adapter = adapter



    }
}