package com.example.superheroes.features.list.presentation

import androidx.lifecycle.ViewModel
import com.example.superheroes.features.list.domain.GetListSuperHeroUseCase

class ListViewModel (private val getListSuperHeroUseCase: GetListSuperHeroUseCase) : ViewModel() {

    //no hace falta poner .invoke, porque literalmete es lo que hara por haber configutado operator e invoke
    fun getSuperHeroes() = getListSuperHeroUseCase()

}