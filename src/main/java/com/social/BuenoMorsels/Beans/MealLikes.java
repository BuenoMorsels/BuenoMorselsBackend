package com.social.BuenoMorsels.Beans;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table
public class MealLikes {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private boolean liked;

	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;

	@ManyToOne
	@JoinColumn(name="meal_id")
	private Meal meal;

	public MealLikes() {
		//TODO
	}
	
}
