package com.api.APIUsuarioComunidade.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class PasswordService {

	private final BCryptPasswordEncoder passwordEncoder;

	public PasswordService() {
		this.passwordEncoder = new BCryptPasswordEncoder();
	}

	public String encodePassword(String rawPassword) {
		return passwordEncoder.encode(rawPassword);
	}

	public boolean matches(String rawPAssword, String encodedPassword) {
		return passwordEncoder.matches(rawPAssword, encodedPassword);
	}

}
