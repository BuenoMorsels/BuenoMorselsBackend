package com.social.BuenoMorsels.Beans;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table
public class Restaurant {

	@Id
	@Column(name="restaurant_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int restaurantId;
	private String restaurantName;
	private String description;
	private String restaurantRating;
	private String cusine;

	public Restaurant() {
		restaurantId = 0;
		restaurantName = "Lombardi's";
		description = "Home-style Italian Restaurant";
		restaurantRating = " 4 out of 5 Stars ";
		cusine = "Italian";
	}

	public int getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}

	public String getRestaurantName() {
		return restaurantName;
	}

	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRestaurantRating() {
		return restaurantRating;
	}

	public void setRestaurantRating(String restaurantRating) {
		this.restaurantRating = restaurantRating;
	}

	public String getCusine() {
		return cusine;
	}

	public void setCusine(String cusine) {
		this.cusine = cusine;
	}

	@Override
	public String toString() {
		return "Restaurant{" +
				"restaurantId=" + restaurantId +
				", restaurantName='" + restaurantName + '\'' +
				", description='" + description + '\'' +
				", restaurantRating='" + restaurantRating + '\'' +
				", cusine='" + cusine + '\'' +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Restaurant)) return false;
		Restaurant that = (Restaurant) o;
		return restaurantId == that.restaurantId && restaurantName.equals(that.restaurantName) && description.equals(that.description) && restaurantRating.equals(that.restaurantRating) && cusine.equals(that.cusine);
	}

	@Override
	public int hashCode() {
		return Objects.hash(restaurantId, restaurantName, description, restaurantRating, cusine);
	}
}
