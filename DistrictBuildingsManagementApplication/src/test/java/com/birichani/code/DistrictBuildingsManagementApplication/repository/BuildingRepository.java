package com.birichani.code.DistrictBuildingsManagementApplication.repository;

import com.birichani.code.DistrictBuildingsManagementApplication.Building;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuildingRepository extends JpaRepository<Building,Integer> {

}
