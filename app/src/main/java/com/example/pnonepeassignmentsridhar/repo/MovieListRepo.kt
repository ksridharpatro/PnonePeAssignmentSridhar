package com.example.pnonepeassignmentsridhar.repo

import com.example.pnonepeassignmentsridhar.mapper.MovieModelMapper
import com.example.pnonepeassignmentsridhar.network.NetworkApi
import com.example.pnonepeassignmentsridhar.ui.MovieUiModel

class MovieListRepo(
    private val networkApi: NetworkApi,
    private val movieModelMapper: MovieModelMapper
) {
    suspend fun getMovieList(): List<MovieUiModel> {
        return movieModelMapper.convertMovieNetworkModelListToUiModelList(
            networkApi.getMovieList()
        )
    }
}