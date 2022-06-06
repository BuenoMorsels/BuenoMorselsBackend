package com.social.BuenoMorsels.Services;

import com.social.BuenoMorsels.Beans.Meal;
import com.social.BuenoMorsels.Beans.MealLikes;

public interface MealService {

	public Meal postNewMeal(Meal newMeal);
	public void likeMeal(MealLikes newLike);

	
	
}
