package com.social.BuenoMorsels.Beans;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table
public class MealLikes {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@EmbeddedId
	private MealLikesId mealLikesId;	
	
	private boolean liked;


	public MealLikes() {
		super();
	}


	public MealLikes(MealLikesId mealLikesId, boolean liked) {
		super();
		this.mealLikesId = mealLikesId;
		this.liked = liked;
	}


	public MealLikesId getMealLikesId() {
		return mealLikesId;
	}


	public void setMealLikesId(MealLikesId mealLikesId) {
		this.mealLikesId = mealLikesId;
	}


	public boolean isLiked() {
		return liked;
	}


	public void setLiked(boolean liked) {
		this.liked = liked;
	}


	@Override
	public int hashCode() {
		return Objects.hash(liked, mealLikesId);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MealLikes other = (MealLikes) obj;
		return liked == other.liked && Objects.equals(mealLikesId, other.mealLikesId);
	}


	@Override
	public String toString() {
		return "MealLikes [mealLikesId=" + mealLikesId + ", liked=" + liked + "]";
	}
	
	
}
