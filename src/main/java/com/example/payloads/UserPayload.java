package com.example.payloads;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserPayload {
	private int userId;
	private String username;
	private String email;
	private String phoneNumber;
	private String address;
	private String password;

	@Override
	public String toString() {
		return "UserPayload [userId=" + userId + ", username=" + username + ", email=" + email + ", phoneNumber="
				+ phoneNumber + ", address=" + address + ", password=" + password + "]";
	}

}
