package com.birichani.code.DistrictBuildingsManagementApplication.controllers;

import com.birichani.code.DistrictBuildingsManagementApplication.Building;
import com.birichani.code.DistrictBuildingsManagementApplication.repository.BuildingRepository;
import com.birichani.code.DistrictBuildingsManagementApplication.service.BuildingReportService;
import net.sf.jasperreports.engine.JRException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;
import java.util.List;

@RestController
public class BuildingController {
    @Autowired
    private BuildingRepository buildingRepository;
    @Autowired
    private BuildingReportService buildingReportService;

    @GetMapping("/getBuildings")
    public List<Building> getBuildings() {

        return buildingRepository.findAll();
    }

    @GetMapping("/report/{format}")
    public String generateReport(@PathVariable String format) throws FileNotFoundException, JRException {
        return buildingReportService.exportReport(format);
    }


}
