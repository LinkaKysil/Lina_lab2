package ua.kpi.its.lab.rest.svc

import ua.kpi.its.lab.rest.entity.Movie

interface MovieService {
    fun create(movie: Movie): Movie
    fun getById(id: Long): Movie?
    fun update(movie: Movie): Movie
    fun deleteById(id: Long)
    fun getAll(): List<Movie>
}
