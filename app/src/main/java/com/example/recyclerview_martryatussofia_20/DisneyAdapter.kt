package com.example.recyclerview_martryatussofia_20

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class DisneyAdapter(private val context: Context, private val disney:List<Disney>, val listener: (Disney) ->Unit)
    : RecyclerView.Adapter<DisneyAdapter.DisneyViewHolder>(){

    class DisneyViewHolder (view: View): RecyclerView.ViewHolder(view){
        val imgDisney = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameDisney= view.findViewById<TextView>(R.id.tv_item_name)
        val descDisney= view.findViewById<TextView>(R.id.tv_item_description)
        fun bindview(disney: Disney, listener: (Disney) -> Unit){

            imgDisney.setImageResource(disney.imgDisney)
            nameDisney.text = disney.nameDisney
            descDisney.text = disney.descDisney
            itemView.setOnClickListener{
                listener(disney)}
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DisneyViewHolder {
        return DisneyViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_disney, parent, false)
        )
    }

    override fun onBindViewHolder(holder: DisneyViewHolder, position: Int) {
        holder.bindview(disney[position], listener)
    }

    override fun getItemCount(): Int = disney.size
    }
