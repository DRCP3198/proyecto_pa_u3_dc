package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Habitacion;
import com.example.demo.repo.IHabitacionRepo;

@Service
public class HabitacionServiceImpl  implements IHabitacionService{

	@Autowired
	private IHabitacionRepo habitacionRepo;
	
	@Override
	public List<Habitacion> buscarHotelInnerJoin() {
		// TODO Auto-generated method stub
		return this.habitacionRepo.buscarHabitacionInnerJoin();
	}

	@Override
	public List<Habitacion> buscarHotelOuterLetfJoin() {
		// TODO Auto-generated method stub
		return this.habitacionRepo.buscarHabitacionOuterLetfJoin();
	}

	@Override
	public List<Habitacion> buscarHotelOuterRightJoin() {
		// TODO Auto-generated method stub
		return this.habitacionRepo.buscarHabitacionOuterRightJoin();
	}

}
