package com.eduardmatei.springboot.cruddemo.service;

import com.eduardmatei.springboot.cruddemo.entity.Bike;

import java.util.List;

public interface BikeService {

    public List<Bike> findAll();

    public Bike findById(int bikeId);

    public void save(Bike bike);

    public void deleteById(int id);
}
