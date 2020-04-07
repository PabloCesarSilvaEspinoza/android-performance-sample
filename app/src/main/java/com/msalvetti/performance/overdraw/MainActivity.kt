package com.msalvetti.performance.overdraw

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.msalvetti.performance.R

class MainActivity : AppCompatActivity(),
    MainPresenter.View {

    private lateinit var presenter: MainPresenter

    private lateinit var recycler: RecyclerView
    private lateinit var adapter: MainAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycler = findViewById(R.id.recycler)
        recycler.layoutManager = LinearLayoutManager(this)

        adapter = MainAdapter()
        recycler.adapter = adapter

        presenter = MainPresenter()
        presenter.init(this)
    }

    override fun loadData(movies: List<Movie>) {
        adapter.movies = movies
    }
}
