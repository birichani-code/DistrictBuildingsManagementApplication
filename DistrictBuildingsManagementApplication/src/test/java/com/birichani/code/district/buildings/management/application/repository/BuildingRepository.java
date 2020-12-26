package com.birichani.code.district.buildings.management.application.repository;

import com.birichani.code.district.buildings.management.application.Building;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuildingRepository extends JpaRepository<Building,Integer> {

}
