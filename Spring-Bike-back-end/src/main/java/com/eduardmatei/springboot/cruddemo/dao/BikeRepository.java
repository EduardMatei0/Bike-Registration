package com.eduardmatei.springboot.cruddemo.dao;

import com.eduardmatei.springboot.cruddemo.entity.Bike;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BikeRepository extends JpaRepository<Bike, Integer> {

}
