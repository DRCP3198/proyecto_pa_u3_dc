package com.example.demo.repo;

import java.util.List;

import com.example.demo.modelo.Habitacion;
import com.example.demo.modelo.Hotel;

public interface IHabitacionRepo {
	
public List<Habitacion> buscarHabitacionInnerJoin();
	
	public List<Habitacion> buscarHabitacionOuterLetfJoin();

	public List<Habitacion> buscarHabitacionOuterRightJoin();

}
