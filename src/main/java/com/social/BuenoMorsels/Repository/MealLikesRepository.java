package com.social.BuenoMorsels.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.social.BuenoMorsels.Beans.MealLikes;
import com.social.BuenoMorsels.Beans.MealLikesId;

@Repository
public interface MealLikesRepository extends CrudRepository<MealLikes, MealLikesId>{

}
