package domain.repository

import domain.model.Collection

interface CollectionRepository {
    suspend fun addCollection() : Collection
}