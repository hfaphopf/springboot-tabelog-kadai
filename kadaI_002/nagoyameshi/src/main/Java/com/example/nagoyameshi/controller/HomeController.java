package com.example.nagoyameshi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.nagoyameshi.repository.RestaurantRepository;

@Controller
public class HomeController {
	private final RestaurantRepository restaurantRepository;        
    
    public HomeController(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;            
    }
    @GetMapping("/")
    public String company() {
        return "admin/company/CompanyPage";
    }   
}
