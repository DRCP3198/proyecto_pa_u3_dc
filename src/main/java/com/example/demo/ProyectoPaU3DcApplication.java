package com.example.demo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Estudiante;
import com.example.demo.modelo.Habitacion;
import com.example.demo.modelo.Hotel;
import com.example.demo.modelo.dto.EstudianteDTO;
import com.example.demo.service.IEstudianteService;
import com.example.demo.service.IHabitacionService;
import com.example.demo.service.IHotelService;

@SpringBootApplication
public class ProyectoPaU3DcApplication implements CommandLineRunner {

	@Autowired
	private IEstudianteService estudianteService;

	@Autowired
	private IHotelService hotelService;

	@Autowired
	private IHabitacionService habitacionService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU3DcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Estudiante estudiante = new Estudiante();
		estudiante.setNombre("Israel");
		estudiante.setApellido("Lincon");
		estudiante.setCedula("17514571691");
		estudiante.setHobby("voley");
		estudiante.setGenero("M");
		estudiante.setFechaNacimiento(LocalDateTime.now());
		estudiante.setCiudad("Cotopaxi");

		Estudiante estudiante1 = new Estudiante();
		estudiante1.setNombre("Mariana");
		estudiante1.setApellido("Madera");
		estudiante1.setCedula("100200300");
		estudiante1.setHobby("bailar");
		estudiante1.setGenero("F");
		estudiante1.setFechaNacimiento(LocalDateTime.now());
		estudiante1.setCiudad("Galapagos");

		Estudiante estudiante2 = new Estudiante();
		estudiante2.setNombre("Anita");
		estudiante2.setApellido("Perez");
		estudiante2.setCedula("100200400");
		estudiante2.setHobby("correr");
		estudiante2.setGenero("F");
		estudiante2.setFechaNacimiento(LocalDateTime.now());
		estudiante2.setCiudad("San Elena");

		Estudiante estudiante3 = new Estudiante();
		estudiante3.setNombre("Rosa");
		estudiante3.setApellido("Luan");
		estudiante3.setCedula("100200500");
		estudiante3.setHobby("nadar");
		estudiante3.setGenero("F");
		estudiante3.setFechaNacimiento(LocalDateTime.now());
		estudiante3.setCiudad("Carchi");

		List<Hotel> hotel = this.hotelService.encontrarHotelInnerJoin("VIP");
		for (Hotel h : hotel) {
			System.out.println(h.getNombre());
			for (Habitacion ha : h.getHabitaciones()) {
				System.out.println("Las habitacion de: " + h.getNombre() + " es: " + ha.getNumero());

			}
		}

		List<Hotel> hotel1 = this.hotelService.encontrarHotelFetchJoin("VIP");

		// LEFT JOIN SIN PARAMETRO
		System.out.println("LEFT JOIN HOTEL");
		List<Hotel> hotel2 = this.hotelService.encontrarHotelOuterLetfJoin();
		for (Hotel hot : hotel2) {
			System.out.println(hot.getNombre());
			/*
			 * for (Habitacion ha : hot.getHabitaciones()) {
			 * System.out.println(ha.getNumero()); }
			 */
		}
		// LEFT JOIN SIN PARAMETRO\
		System.out.println("LEFT JOIN HOTEL");
		List<Hotel> hotel3 = this.hotelService.encontrarHotelOuterLetfJoin();
		for (Hotel hot : hotel3) {
			System.out.println(hot.getNombre());
			/*
			 * for (Habitacion ha : hot.getHabitaciones()) {
			 * System.out.println(ha.getNumero()); }
			 */
		}

		System.out.println("LEFT JOIN HABITACION");
		List<Habitacion> listaH = this.habitacionService.buscarHotelOuterLetfJoin();
		for (Habitacion ha : listaH) {
			System.out.println(ha != null ? ha.getNumero() : null);
			/*
			 * for (Habitacion ha : hot.getHabitaciones()) {
			 * System.out.println(ha.getNumero()); }
			 */
		}
		System.out.println("RIGHT JOIN HABITACION");
		List<Habitacion> listaH1 = this.habitacionService.buscarHotelOuterRightJoin();
		for (Habitacion ha : listaH1) {
			System.out.println(ha != null ? ha.getNumero() : null);
			/*
			 * for (Habitacion ha : hot.getHabitaciones()) {
			 * System.out.println(ha.getNumero()); }
			 */
		}

	}
	/*
	 * List<Hotel> hote4 = this.hotelService.encontrarHotelOuterFullJoin("VIP"); for
	 * (Hotel h : hote4) { System.out.println(h); } List<Hotel> hote5 =
	 * this.hotelService.encontrarHotelFetchJoin("VIP"); for (Hotel h : hote5) {
	 * System.out.println(h); }
	 */

}
