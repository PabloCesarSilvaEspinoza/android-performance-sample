package com.msalvetti.performance.overdraw

import com.msalvetti.performance.R

class MainPresenter {

    private lateinit var view: View

    interface View {
        fun loadData(globers: List<Glober>)
    }

    fun init(view: View) {
        this.view = view
        this.view.loadData(getMockedData())
    }

    private fun getMockedData(): List<Glober> {
        val movie1 = Glober(
            "Movie 1",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
            R.drawable.icon1
        )

        val movie2 = Glober(
            "Movie 2",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
            R.drawable.icon2
        )

        val movie3 = Glober(
            "Movie 3",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
            NO_AVATAR
        )

        val movie4 = Glober(
            "Movie 4",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
            R.drawable.icon3
        )

        val movie5 = Glober(
            "Movie 5",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
            NO_AVATAR
        )

        val movie6 = Glober(
            "Movie 6",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
            R.drawable.icon4
        )

        val movie7 = Glober(
            "Movie 7",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
            R.drawable.icon5
        )

        val movie8  = Glober(
            "Movie 8",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
            R.drawable.icon1
        )

        val movie9 = Glober(
            "Movie 9",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
            NO_AVATAR
        )

        return listOf(
            movie1,movie2,movie3,movie4,movie5,movie6,movie7,movie8,movie9
        )
    }
}