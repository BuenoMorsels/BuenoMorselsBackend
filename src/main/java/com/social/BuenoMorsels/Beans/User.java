package com.social.BuenoMorsels.Beans;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="usr")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="user_id")
	private int userId;
	private String firstName;
	private String lastName;
	private String username;
	@Column(name="passwrd")
	private String password;
	private String email;
	@OneToOne
	@JoinColumn(name="role_id")
	private Role role;
	@Column(name="is_active")
	private boolean isActive;
	@Column(name="is_not_locked")
	private boolean isNotLocked;
	@OneToOne
	@JoinColumn(name="user_pic_id")
	private UserPic userPic;

	public User() {
		userId = 0;
		firstName = "Jane";
		lastName = "Smith";
		username = "jasmith01";
		password = "pass";
		email = "ja.smith.89@gmail.com";
		role = new Role();
		isActive = true;
		isNotLocked = false;
		userPic = new UserPic();
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean active) {
		isActive = active;
	}

	public boolean isNotLocked() {
		return isNotLocked;
	}

	public void setNotLocked(boolean notLocked) {
		isNotLocked = notLocked;
	}

	public UserPic getUserPic() {
		return userPic;
	}

	public void setUserPic(UserPic userPic) {
		this.userPic = userPic;
	}

	@Override
	public String toString() {
		return "User{" +
				"userId=" + userId +
				", firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", username='" + username + '\'' +
				", password='" + password + '\'' +
				", email='" + email + '\'' +
				", role=" + role +
				", isActive=" + isActive +
				", isNotLocked=" + isNotLocked +
				", userPic=" + userPic +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof User)) return false;
		User user = (User) o;
		return userId == user.userId && isActive == user.isActive
				&& isNotLocked == user.isNotLocked
				&& firstName.equals(user.firstName) && lastName.equals(user.lastName)
				&& username.equals(user.username) && password.equals(user.password)
				&& email.equals(user.email) && role.equals(user.role)
				&& userPic.equals(user.userPic);
	}

	@Override
	public int hashCode() {
		return Objects.hash(userId, firstName, lastName, username, password,
				email, role, isActive, isNotLocked, userPic);
	}
}
