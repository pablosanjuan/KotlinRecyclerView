package com.pablosj.personal.recyclerview

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL,false)
        val albums=ArrayList<Album>()
        albums.add(Album("pablo",22,R.drawable.indice1))
        albums.add(Album("cesar",83,R.drawable.indice2))
        albums.add(Album("andres",75,R.drawable.indice3))
        albums.add(Album("felipe",34,R.drawable.indice4))

        val adapter = AdapterAlbum(albums)
        rv.adapter = adapter

    }
}
