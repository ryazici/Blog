package com.yazici.auth;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	User findByUsername(String username);
	
	
	@Query(value = "SELECT * FROM USER   \n" + 
			"WHERE  USERNAME  NOT IN   \n" + 
			"(SELECT USERNAME FROM AUTH_USER_GROUP\n" + 
			"WHERE  AUTH_GROUP = 'ADMIN' )",  nativeQuery = true)
	List<User> findAllUsersNative();
}
