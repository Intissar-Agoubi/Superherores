package com.example.superheroes.features.list.domain

interface SuperHeroRepository {

    fun getSuperHeroList (): List <SuperHero>
}