package com.kktua.applistarrepositorios.data.repositories

import com.kktua.applistarrepositorios.data.model.Repo
import kotlinx.coroutines.flow.Flow

interface RepoRepository {
    suspend fun listRepositories(user: String) : Flow<List<Repo>>
}