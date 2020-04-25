package com.martingrzzler.testdaggerapp.di

import androidx.lifecycle.ViewModelProvider
import com.martingrzzler.testdaggerapp.network.ApiService
import com.martingrzzler.testdaggerapp.network.FakeApiService
import com.martingrzzler.testdaggerapp.repository.FakeMainRepository
import com.martingrzzler.testdaggerapp.repository.MainRepository
import dagger.Module
import dagger.Provides

@Module
object TestAppModule  {


    @JvmStatic
    @Provides
    fun provideFakeApiService(): FakeApiService {
        return FakeApiService()
    }


    @JvmStatic
    @Provides
    fun provideFakeMainRepository(apiService: FakeApiService): MainRepository {
        return FakeMainRepository(apiService)
    }

}