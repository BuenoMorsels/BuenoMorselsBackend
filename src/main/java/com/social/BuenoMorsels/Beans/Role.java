package com.social.BuenoMorsels.Beans;

import javax.persistence.*;

@Entity
@Table
public class Role {

	@Id
	@Column(name="follower_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int followerId;
	@Column
	private int userId;
	@Column
	private int postId;
	

	
}
