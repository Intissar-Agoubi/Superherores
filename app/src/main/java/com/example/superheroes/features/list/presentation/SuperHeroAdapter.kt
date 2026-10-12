package com.example.superheroes.features.list.presentation

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.superheroes.R
import com.example.superheroes.features.list.domain.SuperHero

class SuperHeroAdapter(
    private val superHeroes: List<SuperHero>
) : RecyclerView.Adapter<SuperHeroAdapter.SuperHeroViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperHeroViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_superhero, parent, false)
        return SuperHeroViewHolder(view)
    }

    override fun onBindViewHolder(holder: SuperHeroViewHolder, position: Int) {
        val hero = superHeroes[position]
        holder.nameTextView.text = hero.name

        Glide.with(holder.itemView)
            .load(hero.urlImage)
            .centerCrop()
            .placeholder(R.drawable.ic_launcher_foreground)
            .error(R.drawable.ic_launcher_foreground)
            .into(holder.imageView)
    }

    override fun getItemCount(): Int = superHeroes.size

    class SuperHeroViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.hero_image)
        val nameTextView: TextView = itemView.findViewById(R.id.hero_name)
    }
}
