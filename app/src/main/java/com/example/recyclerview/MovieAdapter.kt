package com.example.recyclerview


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recyclerview.models.Movies
import kotlinx.android.synthetic.main.movie_item.view.*

class MovieAdapter(
    private val movies: List<Movies>
) : RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

    class MovieViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        private val imageUrl = "https://image.tmdb.org/t/p/w500/"
        fun bindMovie(movie: Movies) {
            itemView.movie_title.text = movie.title
            itemView.movie_vote.text = movie.vote
            Glide.with(itemView).load(imageUrl + movie.poster).into(itemView.movie_poster)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        return MovieViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.movie_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.bindMovie(movies[position])
    }

    override fun getItemCount(): Int = movies.size


}
