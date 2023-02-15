package com.example.demo.service;

import java.util.List;

import com.example.demo.modelo.Habitacion;

public interface IHabitacionService {

	public List<Habitacion> buscarHotelInnerJoin();

	public List<Habitacion> buscarHotelOuterLetfJoin();

	public List<Habitacion> buscarHotelOuterRightJoin();

}
