package com.example.superheroes.features.list.domain

class GetListSuperHeroUseCase (private val superHeroRepository: SuperHeroRepository) {

    operator fun invoke(): List<SuperHero>{
        return superHeroRepository.getSuperHeroList()
    }
}