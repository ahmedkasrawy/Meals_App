package com.android.data.remote.repo.meals

import com.android.domain.entity.meals.Category
import retrofit2.http.GET

interface MealsAPI {
    @GET("api/json/v1/1/categories.php")
    suspend fun getMealsResponse(): Category

}