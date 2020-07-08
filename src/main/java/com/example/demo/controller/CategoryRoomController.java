package com.example.demo.controller;

import com.example.demo.model.CategoryRoom;
import com.example.demo.service.impl.CategoryRoomServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
public class CategoryRoomController {
    @Autowired
    private CategoryRoomServiceImpl categoryRoomService;

    @RequestMapping(value = "/api/categoryRooms", method = RequestMethod.GET)
    public ResponseEntity<Iterable<CategoryRoom>> listAllHouse() {
        Iterable<CategoryRoom> categoryRooms = categoryRoomService.findAll();
        if (categoryRooms == null) {
            return new ResponseEntity<Iterable<CategoryRoom>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<Iterable<CategoryRoom>>(categoryRooms, HttpStatus.OK);
    }

}
