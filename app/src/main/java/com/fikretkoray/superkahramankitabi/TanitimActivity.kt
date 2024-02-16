package com.fikretkoray.superkahramankitabi

import android.content.Intent
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fikretkoray.superkahramankitabi.databinding.ActivityTanitimBinding

class TanitimActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTanitimBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTanitimBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val intent = intent
        val secilenKahramanIsmi = intent.getStringExtra("superkahramanIsmi")
        binding.textView.text = secilenKahramanIsmi

        val secilenKahramanGorseli = intent.getIntExtra("superKahramanGorseli",0)
        val bitmap = BitmapFactory.decodeResource(applicationContext.resources,secilenKahramanGorseli)
        binding.imageView.setImageBitmap(bitmap)


        /*
        val secilenKahraman = SingletonClass.SecilenKahraman
        val secilenGorsel = secilenKahraman.gorsel
        binding.imageView.setImageBitmap(secilenGorsel)
        */
    }
}