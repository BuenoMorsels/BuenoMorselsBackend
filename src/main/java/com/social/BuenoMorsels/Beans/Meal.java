package com.social.BuenoMorsels.Beans;

import javax.persistence.*;

@Entity
@Table
public class Meal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="meal_id")
    private int mealId;


	
	
	

}
