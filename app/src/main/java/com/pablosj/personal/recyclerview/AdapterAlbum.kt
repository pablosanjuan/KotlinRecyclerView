package com.pablosj.personal.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class AdapterAlbum(var List: List<Album>) : RecyclerView.Adapter<AdapterAlbum.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.content_item,parent,false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return List.size
    }

    override fun onBindViewHolder(holder: AdapterAlbum.ViewHolder, position: Int) {
        holder.bindItem(List[position])
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        fun bindItem(data: Album) {
            val title: TextView = itemView.findViewById(R.id.txtTitle)
            val count: TextView = itemView.findViewById(R.id.txtCount)
            val thumbnail: ImageView = itemView.findViewById(R.id.thumbnail)
            val menu: ImageView = itemView.findViewById(R.id.menu)

            title.text = data.name
            count.text = data.num.toString()
            Glide.with(itemView.context).load(data.thumbnail).into(thumbnail)

            itemView.setOnClickListener {
                Toast.makeText(itemView.context, "click ${data.name}", Toast.LENGTH_SHORT).show()
            }

            menu.setOnClickListener {
                Toast.makeText(itemView.context, "menu ${data.name}", Toast.LENGTH_SHORT).show()
            }
        }
    }

}