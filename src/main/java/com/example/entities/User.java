package com.example.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "User")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;

	@Column(name = "user_name",nullable = false)
	private String username;

	@Column(name = "email",nullable = false)
	private String email;

	@Column(name = "phone_number",nullable = false)
	private String phoneNumber;

	@Column(name = "address")
	private String address;

	@Column(name = "password")
	private String password;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "role_id", nullable = false)
	private Role role;


	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", email=" + email + ", phoneNumber=" + phoneNumber
				+ ", address=" + address + ", password=" + password + "]";
	}

}
