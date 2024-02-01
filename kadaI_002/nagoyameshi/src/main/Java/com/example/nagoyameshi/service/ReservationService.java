package com.example.nagoyameshi.service;

import org.springframework.stereotype.Service;

@Service
public class ReservationService {
     // 予約人数が定員以下かどうかをチェックする
    public boolean isWithinCapacity(Integer numberOfPeople, Integer capacity) {
        return numberOfPeople <= capacity;
    }
}
