package com.social.BuenoMorsels.Beans;

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
		//TODO
	}




}
