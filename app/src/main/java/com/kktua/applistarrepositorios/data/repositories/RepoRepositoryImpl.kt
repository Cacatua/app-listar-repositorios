package com.kktua.applistarrepositorios.data.repositories

import com.kktua.applistarrepositorios.core.RemoteException
import com.kktua.applistarrepositorios.data.services.GitHubService
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException

class RepoRepositoryImpl(private val service: GitHubService) : RepoRepository {

    override suspend fun listRepositories(user: String) = flow {
        try {
            val repoList = service.listRepositories(user)
            emit(repoList)
        }catch (ex: HttpException) {
            throw RemoteException(ex.message ?: "Não foi possível fazer a busca no momento!")
        }
    }
}