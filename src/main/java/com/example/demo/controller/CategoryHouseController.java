package com.example.demo.controller;

import com.example.demo.model.CategoryHouse;
import com.example.demo.service.impl.CategoryHouseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
public class CategoryHouseController {
    @Autowired
    private CategoryHouseServiceImpl categoryHouseService;

    @RequestMapping(value = "/api/categoryHouses", method = RequestMethod.GET)
    public ResponseEntity<Iterable<CategoryHouse>> listAllHouse() {
        Iterable<CategoryHouse> categoryHouses = categoryHouseService.findAll();
        if (categoryHouses == null) {
            return new ResponseEntity<Iterable<CategoryHouse>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<Iterable<CategoryHouse>>(categoryHouses, HttpStatus.OK);
    }

}
