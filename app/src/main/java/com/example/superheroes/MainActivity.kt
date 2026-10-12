package com.example.superheroes

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.superheroes.features.list.data.SuperHeroDataRepository
import com.example.superheroes.features.list.data.local.SuperHeroMemLocalDataSource
import com.example.superheroes.features.list.domain.GetListSuperHeroUseCase
import com.example.superheroes.features.list.presentation.ListViewModel
import com.example.superheroes.features.list.presentation.SuperHeroAdapter

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listViewModel = ListViewModel(
            GetListSuperHeroUseCase(
                SuperHeroDataRepository(SuperHeroMemLocalDataSource())
            )
        )

        val superHeroesList = listViewModel.getSuperHeroes()
        Log.d(TAG, "onCreate $superHeroesList")

        listOf(
            R.id.superhero_recycler_view,
            R.id.superhero_scroll_recycler_view
        ).forEach { recyclerViewId ->
            findViewById<RecyclerView>(recyclerViewId).apply {
                layoutManager = LinearLayoutManager(this@MainActivity, RecyclerView.VERTICAL, false)
                adapter = SuperHeroAdapter(superHeroesList)
            }
        }
    }

    companion object {
        private const val TAG = "MainActivity"
    }
}
