package com.example.demo.service;

import java.util.List;

import com.example.demo.modelo.Hotel;

public interface IHotelService {

	public List<Hotel> encontrarHotelInnerJoin(String tipoHabitacion);
	
	public List<Hotel> encontrarHotelOuterLetfJoin(String tipoHabitacion);

	public List<Hotel> encontrarHotelOuterRightJoin(String tipoHabitacion);
	public List<Hotel> encontrarHotelOuterFullJoin(String tipoHabitacion);
	public List<Hotel> encontrarHotelFetchJoin(String tipoHabitacion);
	
    public List<Hotel> encontrarHotelInnerJoin();
	
	public List<Hotel> encontrarHotelOuterLetfJoin();

	public List<Hotel> encontrarHotelOuterRightJoin();
	

}
