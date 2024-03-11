package com.pet.rest.repository;

import com.pet.rest.entity.Albums;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlbumsRepo extends JpaRepository<Albums, Integer> {
}
