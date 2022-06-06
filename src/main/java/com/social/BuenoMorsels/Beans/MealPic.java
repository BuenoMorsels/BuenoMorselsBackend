package com.social.BuenoMorsels.Beans;

import java.util.Objects;

import javax.persistence.*;

@Entity
@Table
public class MealPic {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mealPicId;
	private String mealPicURL;

	public MealPic() {
		super();
	}

	@Override
	public String toString() {
		return "MealPic [mealPicId=" + mealPicId + ", mealPicURL=" + mealPicURL + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(mealPicId, mealPicURL);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MealPic other = (MealPic) obj;
		return mealPicId == other.mealPicId && Objects.equals(mealPicURL, other.mealPicURL);
	}

	public MealPic(int mealPicId, String mealPicURL) {
		super();
		this.mealPicId = mealPicId;
		this.mealPicURL = mealPicURL;
	}




}
