package com.msalvetti.performance.overdraw

import com.msalvetti.performance.R

class MainPresenter {

    private lateinit var view: View

    interface View {
        fun loadData(movies: List<Movie>)
    }

    fun init(view: View) {
        this.view = view
        this.view.loadData(getMockedData())
    }

    private fun getMockedData(): List<Movie> {
        val movie1 = Movie(
            "Movie 1",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
            R.drawable.icon1
        )

        val movie2 = Movie(
            "Movie 2",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
            R.drawable.icon2
        )

        val movie3 = Movie(
            "Movie 3",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
            NO_AVATAR
        )

        val movie4 = Movie(
            "Movie 4",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
            R.drawable.icon3
        )

        val movie5 = Movie(
            "Movie 5",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
            NO_AVATAR
        )

        val movie6 = Movie(
            "Movie 6",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
            R.drawable.icon4
        )

        val movie7 = Movie(
            "Movie 7",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
            R.drawable.icon5
        )

        val movie8  = Movie(
            "Movie 8",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
            R.drawable.icon1
        )

        val movie9 = Movie(
            "Movie 9",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
            NO_AVATAR
        )

        return listOf(
            movie1,movie2,movie3,movie4,movie5,movie6,movie7,movie8,movie9
        )
    }
}