package com.example.recyclerview_martryatussofia_20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailDisneyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_disney)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val disney = intent.getParcelableExtra<Disney>(MainActivity.INTENT_PARCELABLE)

        val imgDisney = findViewById<ImageView>(R.id.img_item_photo)
        val nameDisney = findViewById<TextView>(R.id.tv_item_name)
        val descDisney = findViewById<TextView>(R.id.tv_item_description)

        imgDisney.setImageResource(disney?.imgDisney!!)
        nameDisney.text = disney.nameDisney
        descDisney.text = disney.descDisney
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}