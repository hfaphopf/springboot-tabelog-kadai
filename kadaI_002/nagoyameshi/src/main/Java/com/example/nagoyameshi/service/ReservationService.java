package com.example.nagoyameshi.service;

import org.springframework.stereotype.Service;

@Service
public class ReservationService {
	// 宿泊人数が定員以下かどうかをチェックする
	public boolean isWithinSeats(Integer numberOfPeople, Integer seats) {
		return numberOfPeople <= seats;
	}
}
