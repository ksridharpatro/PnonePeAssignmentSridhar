package com.example.pnonepeassignmentsridhar.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pnonepeassignmentsridhar.databinding.SingelMovieLayoutBinding
import java.util.*

class MovieListAdapter : RecyclerView.Adapter<MovieListAdapter.MovieViewHolder>() {

    private val movieList = ArrayList<MovieUiModel>()
    var interactionListener: ItemInteractionListener? = null

    class MovieViewHolder(
        private val binding: SingelMovieLayoutBinding,
        private val interactionListener: ItemInteractionListener?
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(movieUiModel: MovieUiModel) {
            binding.textMovieName.text = movieUiModel.movieName
            binding.textRatting.text = movieUiModel.movieRating.toString()
            binding.btnAddToPlaylist.setOnClickListener {
                interactionListener?.onFavIconClick(movieUiModel)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val binding = SingelMovieLayoutBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return MovieViewHolder(binding, interactionListener)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.bind(movieList[position])
    }

    override fun getItemCount(): Int = movieList.size

    interface ItemInteractionListener {
        fun onFavIconClick(movieUiModel: MovieUiModel)
    }
}