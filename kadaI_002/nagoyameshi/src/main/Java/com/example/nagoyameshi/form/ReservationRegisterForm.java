package com.example.nagoyameshi.form;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ReservationRegisterForm {

	public Integer restaurantId;

	public Integer userId;

	public String reservationDate;

	public Integer numberOfPeople;
}
