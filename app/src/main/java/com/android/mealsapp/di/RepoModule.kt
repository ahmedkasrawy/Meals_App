package com.example.mealsapp.di



import com.android.data.remote.repo.meals.MealsAPI
import com.android.domain.entity.meals.repo.meals.MainRepo

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RepoModule {

    @Provides
    fun providedMealsRepo(
        mealsApi: MealsAPI
    ): MainRepo {
        return MealsRepoImpl(mealsApi)
    }
}