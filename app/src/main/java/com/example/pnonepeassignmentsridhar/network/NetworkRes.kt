package com.example.pnonepeassignmentsridhar.network

import com.example.pnonepeassignmentsridhar.ui.MovieUiModel

sealed class NetworkRes {
    object NetWorkResLoading : NetworkRes()

    object NetworkResError : NetworkRes()

    class NetWorkResSuccess(val movieList: List<MovieUiModel>) : NetworkRes()
}