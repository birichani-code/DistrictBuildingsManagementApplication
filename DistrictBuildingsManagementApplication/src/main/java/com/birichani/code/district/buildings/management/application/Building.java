package com.birichani.code.district.buildings.management.application;

import lombok.*;

import javax.persistence.*;


@Data
@Entity
public class Building {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String address;
    private int no_of_apartments;
    private int no_of_floors;
    private double area_metres;
    private String owner;
    private  int year_of_construction;



}
