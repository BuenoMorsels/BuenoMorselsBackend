package com.social.BuenoMorsels.Services;

import org.springframework.stereotype.Service;

import com.social.BuenoMorsels.Beans.Meal;
import com.social.BuenoMorsels.Beans.MealLikes;
import com.social.BuenoMorsels.Repository.MealLikesRepository;
import com.social.BuenoMorsels.Repository.MealRepository;

@Service
public class MealServiceImpl implements MealService{

	private MealRepository mealRepo;
	private MealLikesRepository likesRepo;
	
	@Override
	public Meal postNewMeal(Meal newMeal) {
		int newId = mealRepo.save(newMeal).getMealId();
		newMeal.setMealId(newId);
		return newMeal;		
	}

	@Override
	public void likeMeal(MealLikes newLike) {
		likesRepo.save(newLike);
		
	}

}
