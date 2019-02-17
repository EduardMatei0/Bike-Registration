package com.eduardmatei.springboot.cruddemo.service;

import com.eduardmatei.springboot.cruddemo.dao.BikeRepository;
import com.eduardmatei.springboot.cruddemo.entity.Bike;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BikeServiceImpl implements BikeService{

    private final BikeRepository bikeRepository;

    @Autowired
    public BikeServiceImpl(BikeRepository bikeRepository) {
        this.bikeRepository = bikeRepository;
    }

    @Override
    public List<Bike> findAll() {
        return bikeRepository.findAll();
    }

    @Override
    public Bike findById(int theId) {
        Optional<Bike> result = bikeRepository.findById(theId);
        Bike bike = null;

        if(result.isPresent()) {
            bike = result.get();
        } else {
            throw new RuntimeException("Did not find bike id: " + theId);
        }

        return  bike;
    }

    @Override
    public void save(Bike bike) {
        bikeRepository.save(bike);
    }

    @Override
    public void deleteById(int theId) {
        bikeRepository.deleteById(theId);
    }
}
