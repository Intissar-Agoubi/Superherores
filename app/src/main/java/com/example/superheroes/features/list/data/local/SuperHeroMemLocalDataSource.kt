package com.example.superheroes.features.list.data.local

import com.example.superheroes.features.list.domain.SuperHero

class SuperHeroMemLocalDataSource {

    private val localSuperHeroes: List<SuperHero> = listOf(
        SuperHero("1", "Superman", "superman", "https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/b514e3cf-d394-43fb-be65-1711518576b6/dfo5g3c-71cb0699-d99a-4471-a07f-bd1b64f4f2db.png/v1/fill/w_1280,h_855,q_80,strp/superman___legacy_by_argocityartworks_dfo5g3c-fullview.jpg?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7ImhlaWdodCI6Ijw9ODU1IiwicGF0aCI6IlwvZlwvYjUxNGUzY2YtZDM5NC00M2ZiLWJlNjUtMTcxMTUxODU3NmI2XC9kZm81ZzNjLTcxY2IwNjk5LWQ5OWEtNDQ3MS1hMDdmLWJkMWI2NGY0ZjJkYi5wbmciLCJ3aWR0aCI6Ijw9MTI4MCJ9XV0sImF1ZCI6WyJ1cm46c2VydmljZTppbWFnZS5vcGVyYXRpb25zIl19.AjwOg-omxKNzelvAzFTqPGOtzqWSpDPQlQoyBTQutws"),
        SuperHero("2", "Batman", "batman", "https://static1.srcdn.com/wordpress/wp-content/uploads/2025/02/90s-batman-with-all-black-costume-featured-dc.jpg"),
        SuperHero("3", "Spider-Man", "spider-man", "https://static1.srcdn.com/wordpress/wp-content/uploads/2024/07/spider-man-with-dark-energy-web.jpg"),
        SuperHero("4", "Wonder Woman", "wonder-woman", "https://th.bing.com/th/id/R.7114316e3006d4bdb9a84b1032e3374f?rik=xejU7VOA0hIdGA&pid=ImgRaw&r=0"),
        SuperHero("5", "Iron Man", "iron-man", "https://tse2.mm.bing.net/th/id/OIP.A1yElJT8HZum9QAQZWFr6QHaFj?r=0&rs=1&pid=ImgDetMain&o=7&rm=3"),
        SuperHero("6", "Captain America", "captain-america", "https://th.bing.com/th/id/R.98b523f641afc13c4c5e5f3883e2b7a3?rik=moCpXgcpm9yCGg&riu=http%3a%2f%2fnotedetengas.es%2fwp-content%2fuploads%2f2011%2f08%2fcapitan-america.jpg&ehk=qlbnnDdKLeWiMGRCLXPFOwLYzjemNebPHIT4PhyYSB0%3d&risl=&pid=ImgRaw&r=0"),
        SuperHero("7", "Black Widow", "black-widow", "https://tse1.mm.bing.net/th/id/OIP.r7N3WYgkBguROEJYZlk9cgHaEK?r=0&rs=1&pid=ImgDetMain&o=7&rm=3"),
        SuperHero("8", "Thor", "thor", "https://tse2.mm.bing.net/th/id/OIP.J_fi9V6RrkUEamAs7n7X9AHaEK?r=0&rs=1&pid=ImgDetMain&o=7&rm=3"),
        SuperHero("9", "Hulk", "hulk", "https://th.bing.com/th/id/R.6b4eb1b1eb8ac8947d5dea7bd6938bfa?rik=G3gzAQ%2fFAF9%2bMw&riu=http%3a%2f%2fwww.rinconutil.com%2fwp-content%2fuploads%2f2015%2f08%2fImagen-Hulk-Comic.jpg&ehk=1qQH%2b2504lPne5522WVKiA%2fRbAt9VcErNW2T3ld%2bs9o%3d&risl=&pid=ImgRaw&r=0"),
        SuperHero("10", "Aquaman", "aquaman", "https://th.bing.com/th/id/R.445252062729a1a6a01a7e16fd084021?rik=RPt%2bcCH36eg21w&pid=ImgRaw&r=0")
    )

    fun getAll(): List<SuperHero> = localSuperHeroes
}