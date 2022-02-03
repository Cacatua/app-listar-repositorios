package com.kktua.applistarrepositorios.domain

import com.kktua.applistarrepositorios.core.UseCase
import com.kktua.applistarrepositorios.data.model.Repo
import com.kktua.applistarrepositorios.data.repositories.RepoRepository
import kotlinx.coroutines.flow.Flow

class ListUserRepositoriesUseCase(private val repository: RepoRepository) :
    UseCase<String, List<Repo>>() {
    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }
}