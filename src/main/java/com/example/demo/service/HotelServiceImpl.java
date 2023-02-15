package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Hotel;
import com.example.demo.repo.IHotelRepo;

@Service
public class HotelServiceImpl implements IHotelService {

	
	@Autowired
	private IHotelRepo hotelRepo;
	@Override
	public List<Hotel> encontrarHotelInnerJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return this.hotelRepo.buscarHotelInnerJoin(tipoHabitacion);
	}
	
	@Override
	public List<Hotel> encontrarHotelOuterLetfJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return this.hotelRepo.buscarHotelOuterLetfJoin(tipoHabitacion);
	}

	@Override
	public List<Hotel> encontrarHotelOuterRightJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return this.hotelRepo.buscarHotelOuterRightJoin(tipoHabitacion);
	}

	@Override
	public List<Hotel> encontrarHotelOuterFullJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return this.hotelRepo.buscarHotelOuterFullJoin(tipoHabitacion);
	}

	@Override
	public List<Hotel> encontrarHotelFetchJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return this.hotelRepo.buscarHotelFetchJoin(tipoHabitacion);
	}

	@Override
	public List<Hotel> encontrarHotelInnerJoin() {
		// TODO Auto-generated method stub
		return this.hotelRepo.buscarHotelInnerJoin();
	}

	@Override
	public List<Hotel> encontrarHotelOuterLetfJoin() {
		// TODO Auto-generated method stub
		return this.hotelRepo.buscarHotelOuterLetfJoin();
	}

	@Override
	public List<Hotel> encontrarHotelOuterRightJoin() {
		// TODO Auto-generated method stub
		return this.hotelRepo.buscarHotelOuterRightJoin();
	}

}
