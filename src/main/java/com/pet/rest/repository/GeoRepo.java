package com.pet.rest.repository;

import com.pet.rest.entity.Geo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeoRepo extends JpaRepository<Geo, Integer> {
}
