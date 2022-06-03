package com.social.BuenoMorsels.Beans;

import javax.persistence.*;

@Entity
@Table
public class UserPic {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userPicId;
	private String userPicURL;

	public UserPic() {
		//TODO
	}




	
}
