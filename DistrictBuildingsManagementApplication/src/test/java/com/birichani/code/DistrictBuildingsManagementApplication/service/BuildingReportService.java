package com.birichani.code.DistrictBuildingsManagementApplication.service;


import com.birichani.code.DistrictBuildingsManagementApplication.Building;
import com.birichani.code.DistrictBuildingsManagementApplication.repository.BuildingRepository;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class BuildingReportService {
    @Autowired
    private BuildingRepository repository;
    public String exportReport(String reportFormat) throws FileNotFoundException, JRException, JRException {
        String path = "C:\\Users\\-Sb25\\Desktop\\folderWithAPIContents\\JasperReports";
        List<Building> buildings = repository.findAll();
        //load file and compile it
        File file = ResourceUtils.getFile("classpath:buildings.jrxml");
        JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(buildings);
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("createdBy", "Birichani Code");
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
        if (reportFormat.equalsIgnoreCase("html")) {
            JasperExportManager.exportReportToHtmlFile(jasperPrint, path + "\\buildings.html");
        }
        if (reportFormat.equalsIgnoreCase("pdf")) {
            JasperExportManager.exportReportToPdfFile(jasperPrint, path + "\\buildings.pdf");
        }

        return "report generated in path : " + path;
    }

}
