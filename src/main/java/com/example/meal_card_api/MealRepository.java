package com.example.meal_card_api;

import org.springframework.data.repository.CrudRepository;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface MealRepository extends CrudRepository<Meal, Integer> {

}

