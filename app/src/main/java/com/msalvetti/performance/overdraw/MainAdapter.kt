package com.msalvetti.performance.overdraw

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.msalvetti.performance.R
import kotlin.properties.Delegates

const val NO_AVATAR = 0

class MainAdapter : RecyclerView.Adapter<MainAdapter.ViewHolder>() {

    var movies: List<Movie> by Delegates.observable(
        emptyList(),
        { _, _, _ -> notifyDataSetChanged() }
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(
                    R.layout.item_main_adapter,
                    parent,
                    false
                )
        )
    }

    override fun getItemCount(): Int = movies.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(movies[position])
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        private var movieAvatar: ImageView = itemView.findViewById(R.id.movie_avatar)
        private var name: TextView = itemView.findViewById(R.id.movie_name)
        private var description: TextView = itemView.findViewById(R.id.movie_description)

        fun bind(movie: Movie) {
            name.text = movie.name
            description.text = movie.description

            Glide.with(itemView.context)
                .load(movie.avatarRes)
                .centerCrop()
                .into(movieAvatar)
        }
    }
}