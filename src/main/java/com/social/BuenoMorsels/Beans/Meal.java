package com.social.BuenoMorsels.Beans;

import javax.persistence.*;

import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table
public class Meal {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "meal_id")
	private int mealId;
	private String title;
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	@ManyToOne
	@JoinColumn(name = "restaurant_id")
	private Restaurant restaurant;
	private String mealText;
	private int mealRating;
	@OneToOne
	@JoinColumn(name = "meal_pic_id")
	private MealPic mealPic;
	private LocalDateTime sentAt;

	public Meal() {
		mealId = 0;
		title = "Beef & Barley Stew";
		user = new User();
		restaurant = new Restaurant();
		mealText = "This is Stew";
		mealRating = 4;
		mealPic = new MealPic();
		sentAt = null;
	}

	public int getMealId() {
		return mealId;
	}

	public void setMealId(int mealId) {
		this.mealId = mealId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	public String getMealText() {
		return mealText;
	}

	public void setMealText(String mealText) {
		this.mealText = mealText;
	}

	public int getMealRating() {
		return mealRating;
	}

	public void setMealRating(int mealRating) {
		this.mealRating = mealRating;
	}

	public MealPic getMealPic() {
		return mealPic;
	}

	public void setMealPic(MealPic mealPic) {
		this.mealPic = mealPic;
	}

	public LocalDateTime getSentAt() {
		return sentAt;
	}

	public void setSentAt(LocalDateTime sentAt) {
		this.sentAt = sentAt;
	}

	@Override
	public String toString() {
		return "Meal{" + "mealId=" + mealId + ", title='" + title + '\'' + ", user=" + user + ", restaurant="
				+ restaurant + ", mealText='" + mealText + '\'' + ", mealRating=" + mealRating + ", mealPic=" + mealPic
				+ ", sentAt='" + sentAt + '\'' + '}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof Meal))
			return false;
		Meal meal = (Meal) o;
		return mealId == meal.mealId && mealRating == meal.mealRating && title.equals(meal.title)
				&& user.equals(meal.user) && restaurant.equals(meal.restaurant) && mealText.equals(meal.mealText)
				&& mealPic.equals(meal.mealPic) && sentAt.equals(meal.sentAt);
	}

	@Override
	public int hashCode() {
		return Objects.hash(mealId, title, user, restaurant, mealText, mealRating, mealPic, sentAt);
	}
}
