package com.example.superheroes.features.list.data

import com.example.superheroes.features.list.data.local.SuperHeroMemLocalDataSource
import com.example.superheroes.features.list.domain.SuperHero
import com.example.superheroes.features.list.domain.SuperHeroRepository

class SuperHeroDataRepository (private val superHeroMemLocalDataSource: SuperHeroMemLocalDataSource) : SuperHeroRepository{
    override fun getSuperHeroList(): List<SuperHero> {
        return superHeroMemLocalDataSource.getAll()
    }
}