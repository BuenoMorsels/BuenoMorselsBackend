package com.social.BuenoMorsels.Beans;

import javax.persistence.*;

@Entity
@Table
public class Restaurant {

	@Id
	@Column(name="restaurant_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int restaurantId;
	
	@Column
	private String title;
	
	
	@Column
	private String description;
	
	@Column(name="post_id")
	private int postId;
	
	

	
}
