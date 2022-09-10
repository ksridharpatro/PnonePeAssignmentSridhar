package com.example.pnonepeassignmentsridhar.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.pnonepeassignmentsridhar.network.NetworkRes
import com.example.pnonepeassignmentsridhar.repo.MovieListRepo

class MainActivityViewModel : ViewModel() {

    private val _networkResLivedata = MutableLiveData<NetworkRes>()
    lateinit var movieRepo: MovieListRepo

    init {
        getMovieList()
    }

    private fun getMovieList() {

    }

}