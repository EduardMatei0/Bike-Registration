package com.eduardmatei.springboot.cruddemo.rest;

import com.eduardmatei.springboot.cruddemo.entity.Bike;
import com.eduardmatei.springboot.cruddemo.service.BikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BikeRestController {

    @Autowired
    private BikeService bikeService;

    @GetMapping("/bikes")
    public List<Bike> findAll() {
        return bikeService.findAll();
    }

    @GetMapping("/bikes/{bikeId}")
    public Bike getBike(@PathVariable int bikeId) {

        Bike bike = bikeService.findById(bikeId);

        if(bike == null) {
            throw new RuntimeException("Bike id not found: " + bike);
        }

        return bike;
    }

    @PostMapping("/bikes")
    public Bike addEmployee(@RequestBody Bike bike) {

        // also just in case they pass an id in JSON ... set id to 0
        // this is to force a save of new item ... instead of update

        bike.setId(0);

        bikeService.save(bike);

        return bike;
    }

    // add mapping for PUT /employees - update existing employee

    @PutMapping("/bikes")
    public Bike updateEmployee(@RequestBody Bike bike) {

        bikeService.save(bike);

        return bike;
    }

    // add mapping for DELETE /employees/{employeeId} - delete employee

    @DeleteMapping("/bikes/{bikeId}")
    public String deleteEmployee(@PathVariable int bikeId) {

        Bike bike = bikeService.findById(bikeId);

        // throw exception if null

        if (bike == null) {
            throw new RuntimeException("Employee id not found - " + bikeId);
        }

        bikeService.deleteById(bikeId);

        return "Deleted employee id - " + bikeId;
    }
}
