package com.example.recyclerview_martryatussofia_20

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJEK_INTEN"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val disneyList = listOf<Disney>(
           Disney(
               R.drawable.anna,
               nameDisney = "Anna",
               descDisney = "Anna adalah putri termuda dari mantan raja Agdar dan mantan ratu Idun, Ia juga merupakan adik dari Elsa, dan putri kerajaan Arendelle. Anna merupakan gadis yang pemberani selalu bertindak tanpa memikirkan akibatnya."
           ),
           Disney(
               R.drawable.bele,
               nameDisney = "Belle",
               descDisney = "Belle adalah seorang gadis muda yang tinggal di kota kecil di Prancis bersama ayahnya yang merupakan seorang penemu bernama Maurice."
           ),
           Disney(
               R.drawable.cinder,
               nameDisney = "Cinderella",
               descDisney = "Cinderella merupakan gadis baik hati nan suci, Dia tinggal bersama ibu dan saudari tirinya. Ella selalu menuruti perintah ibu dan saudari tirinya walaupun tempat yang mereka tinggali adalah rumah peninggalan Ayah dan Ibunya. "
           ),
           Disney(
               R.drawable.jasmine,
               nameDisney = "Yasmine",
               descDisney = "Putri Yasmin merupakan putri timur tengah. Konon Yasmine berasal dari persia, saat persia berganti nama menjadi Iran. Karakternya yang kuat dalam menyampaikan pendapat dan selalu percaya kepada orang lain seperti pada saat baru pertama kali bertemu Aladdin"
           ),
           Disney(
               R.drawable.snowwhite,
               nameDisney = "Snow White",
               descDisney = "Snow White merupakan gadis cantik berkulit putih seputih salju, Meski menghadapi banyak kesulitan ia tetap baik hati pada siapa saja yang menemuinya. Apalagi pada kurcaci yang telah menolongnya."
           ),
           Disney(
               R.drawable.miyau,
               nameDisney = "Miyau Kiyowo",
               descDisney = "Anak kecil yang imut dan manis tapi selalu melakukan sesuatu tanpa berpikir panjang. Dia memasuki dunia game lalu bertemu dengan para princess."
           ),
       )

       val recyclerView = findViewById<RecyclerView>(R.id.rv_disney)
       recyclerView.layoutManager = LinearLayoutManager(this)
       recyclerView.setHasFixedSize(true)
       recyclerView.adapter = DisneyAdapter(this, disneyList){
           val intent = Intent (this, DetailDisneyActivity::class.java)
           intent.putExtra(INTENT_PARCELABLE, it)
           startActivity(intent)

       }
    }
}