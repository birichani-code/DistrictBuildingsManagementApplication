package com.birichani.code.district.buildings.management.application;

import lombok.*;

import javax.persistence.*;


@Data
@Entity
public class Building {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String address;
    private int noOfApartments;
    private int noOfFloors;
    private double areaMetres;
    private String owner;
    private  int yearOfConstruction;



}
