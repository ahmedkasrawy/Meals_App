package com.example.mealsapp.di


import com.android.domain.entity.meals.repo.meals.MainRepo
import com.android.domain.entity.meals.usecase.meals.meals.GetMeals
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {

    @Provides
    fun provideGetMealsCategoriesFromRemoteUseCase(mealsRepo: MainRepo): GetMeals {
        return GetMeals(mealsRepo)
    }


}