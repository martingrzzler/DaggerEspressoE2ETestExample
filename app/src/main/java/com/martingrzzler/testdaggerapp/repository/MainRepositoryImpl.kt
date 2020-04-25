package com.martingrzzler.testdaggerapp.repository

import com.martingrzzler.testdaggerapp.network.ApiService
import com.martingrzzler.testdaggerapp.network.User
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class MainRepositoryImpl @Inject constructor(
    private val apiService: ApiService,
    private val ioDispatcher: CoroutineDispatcher = Dispatchers.IO
) : MainRepository {


    override suspend fun getUser(): User {
        return withContext(ioDispatcher) {
            val result = apiService.getUser()
            return@withContext result[0]
        }

    }

}