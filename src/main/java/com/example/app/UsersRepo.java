package com.example.app;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.app.entity.Users;

@RepositoryRestResource(collectionResourceRel = "users",path = "users")
public interface UsersRepo extends JpaRepository<Users, Long> {

}
