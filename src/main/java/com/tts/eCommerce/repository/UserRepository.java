package com.tts.eCommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tts.eCommerce.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	public User findByUsername(String username);

	public void save(org.springframework.boot.autoconfigure.security.SecurityProperties.User user);
}
