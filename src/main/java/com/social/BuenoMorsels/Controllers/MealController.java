package com.social.BuenoMorsels.Controllers;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.social.BuenoMorsels.Beans.Meal;
import com.social.BuenoMorsels.Beans.MealLikes;
import com.social.BuenoMorsels.Services.MealService;

@RestController
@RequestMapping(path = "/meal")
@CrossOrigin(origins = "http://localhost:4200")
public class MealController {

	private static MealService mealService;
	
//	@Autowired
//	public MealController(MealService mealService) {
//		MealController.mealService = mealService;
//	}  not sure if we need it autowired
	
	public MealController() {
		super();
	}

	public ResponseEntity<Void> postMeal(@RequestBody Meal newMeal) {
		if (newMeal != null) {
			newMeal.setSentAt(LocalDateTime.now());
			mealService.postNewMeal(newMeal);
			return ResponseEntity.status(HttpStatus.CREATED).build();
		}
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
	}

	@PostMapping(path = "/like")
	public ResponseEntity<Void> likeMeal(@RequestBody MealLikes newLike) {
		if (newLike != null) {
			System.out.println(newLike);
			mealService.likeMeal(newLike);
			return ResponseEntity.status(HttpStatus.CREATED).build();
		}
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
	}
}
