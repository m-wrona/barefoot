package com.herolynx.barefoot.repository

/**
 * Read-only access
 *
 * @author Michal Wronski
 */
interface ReadRepository<T> {

    fun get(): List<T>

    fun get(id: String): T?

}