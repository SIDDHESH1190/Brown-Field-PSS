package com.brownfield.pss.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.brownfield.pss.model.User;

//this interface extends the CrudRepository interface from Spring Data JPA.

@Repository
public interface IUserRepository extends JpaRepository<User, Long> {

	// declare the getUserByUsername() method with an embedded query to select user
	// details by username.
	@Query("SELECT u FROM User u WHERE u.emailId = :emailId")
	public User getUserByUsername(@Param("emailId") String emailId);
}