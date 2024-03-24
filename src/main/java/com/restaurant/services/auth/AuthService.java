package com.restaurant.services.auth;

import com.restaurant.dto.SignupRequest;
import com.restaurant.dto.UserDto;

public interface AuthService {

	UserDto createUser(SignupRequest signupRequest);

	boolean hasUserWithEmail(String email);
}
