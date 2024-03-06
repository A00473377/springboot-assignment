package com.api.assignment.springbootassignment.controller;
//
//import com.api.assignment.springbootassignment.entity.Hotel;
//import com.api.assignment.springbootassignment.service.HotelService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//import java.util.List;
//package com.api.assignment.springbootassignment.controller;
//
//import com.api.assignment.springbootassignment.entity.Hotel;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@RestController
//@RequestMapping("/hotels")
//public class HotelController {
//
//    private List<Hotel> hotels = new ArrayList<>();
//
//    @GetMapping
//    public List<Hotel> getAllHotels() {
//        return hotels;
//    }
//
//    @PostMapping
//    public Hotel addHotel(@RequestBody Hotel hotel) {
//        hotels.add(hotel);
//        return hotel;
//    }
//}

import com.api.assignment.springbootassignment.entity.Hotel;
import com.api.assignment.springbootassignment.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {

    @Autowired
    private HotelRepository hotelRepository;

    @GetMapping
    public List<Hotel> getAllHotels() {
        return hotelRepository.findAll();
    }

    @PostMapping
    public Hotel addHotel(@RequestBody Hotel hotel) {
        return hotelRepository.save(hotel);
    }
}
