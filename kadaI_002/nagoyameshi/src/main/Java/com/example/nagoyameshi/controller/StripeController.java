package com.example.nagoyameshi.controller;

import org.springframework.stereotype.Controller;

import com.example.nagoyameshi.service.StripeService;

@Controller
public class StripeController {
	private final StripeService stripeService;

	public StripeController(StripeService stripeService) {
		this.stripeService = stripeService;
	}
}
