package com.social.BuenoMorsels.Beans;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class MealLikesId {

private static final long serialVersionUID = 1L;
	
	@Column(name = "usr.user_id", nullable = false, insertable = false, updatable = false)
    private int userId;

    @Column(name = "meal.meal_id", nullable = false, insertable = false, updatable = false)
    private int mealId;

    public MealLikesId() {
		this.userId =0;
		this.mealId =0;
	}
    
	public MealLikesId(int userId, int mealId) {
		super();
		this.userId = userId;
		this.mealId = mealId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getMealId() {
		return mealId;
	}

	public void setMealId(int mealId) {
		this.mealId = mealId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(mealId, userId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MealLikesId other = (MealLikesId) obj;
		return mealId == other.mealId && userId == other.userId;
	}

	@Override
	public String toString() {
		return "MealLikesId [userId=" + userId + ", mealId=" + mealId + "]";
	}

    
}
