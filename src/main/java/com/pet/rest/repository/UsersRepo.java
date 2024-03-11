package com.pet.rest.repository;

import com.pet.rest.entity.Posts;
import com.pet.rest.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepo extends JpaRepository<Users, Integer> {
}
