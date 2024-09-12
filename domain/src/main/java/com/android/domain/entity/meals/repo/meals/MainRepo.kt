package com.android.domain.entity.meals.repo.meals

import com.android.domain.entity.meals.Category

interface MainRepo {
    suspend fun getMeals():Category
}