package com.android.domain.entity.meals.usecase.meals.meals

import com.android.domain.entity.meals.repo.meals.MainRepo

class GetMeals(private val mealRepo: MainRepo) {
    suspend operator fun invoke() = mealRepo.getMeals()
}