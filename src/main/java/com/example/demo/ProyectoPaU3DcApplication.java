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
import com.example.demo.service.IHotelService;

@SpringBootApplication
public class ProyectoPaU3DcApplication implements CommandLineRunner {

	@Autowired
	private IEstudianteService estudianteService;

	@Autowired
	private IHotelService hotelService;

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

		// Insertar
		/*
		 * this.estudianteService.agregar(estudiante);
		 * this.estudianteService.agregar(estudiante1);
		 * this.estudianteService.agregar(estudiante2);
		 */
		// this.estudianteService.agregar(estudiante3);

		// Consulta
		/*
		 * System.out.println("CONSULTA POR NOMBRE"); Estudiante estu =
		 * this.estudianteService.encontrarPorNombre("Dillan");
		 * System.out.println(estu); System.out.println();
		 */
		// Consulta
		/*
		 * System.out.println("CONSULTA POR APELLIDO"); Estudiante estu1 =
		 * this.estudianteService.encontrarPorApellido("Pozo");
		 * System.out.println(estu1); System.out.println();
		 */
		// Consulta
		/*
		 * System.out.println("CONSULTA POR GENERO"); Estudiante estu2 =
		 * this.estudianteService.encontrarPorGenero("M"); System.out.println(estu2);
		 * System.out.println();
		 */
		// Consulta
		/*
		 * System.out.println("CONSULTA POR CEDULA"); Estudiante estu3 =
		 * this.estudianteService.encontrarPorCedula("1718674649");
		 * System.out.println(estu3); System.out.println();
		 */
		// Consulta
		/*
		 * System.out.println("CONSULTA POR CIUDAD"); Estudiante estu4 =
		 * this.estudianteService.encontrarPorCiudad("Guayaquil");
		 * System.out.println(estu4); System.out.println();
		 */
		// Consulta
		/*
		 * System.out.println("CONSULTA POR NOMBRE Type Query"); Estudiante estu5 =
		 * this.estudianteService.encontrarPorNombreQueryType("Dillan");
		 * System.out.println(estu5); System.out.println(); //Consulta
		 * System.out.println("CONSULTA POR NOMBRE Named Query"); Estudiante estu6 =
		 * this.estudianteService.encontrarPorNombreNamedQuery("Amely");
		 * System.out.println(estu6); System.out.println(); //Consulta
		 * System.out.println("CONSULTA POR NOMBRE Named Query Type"); Estudiante estu7
		 * = this.estudianteService.encontrarPorNombreNamedQueryType("Dillan");
		 * System.out.println(estu7); //Consulta
		 * System.out.println("CONSULTA POR NOMBRE Native Query"); Estudiante estu8 =
		 * this.estudianteService.encontrarrPorNombreNativeQuery("Dillan");
		 * System.out.println(estu8);
		 */
		// Consulta
		/*
		 * System.out.println("CONSULTA POR NOMBRE NativeTypeNamed"); Estudiante estu9 =
		 * this.estudianteService.encontrarPorNombreNativeTypeNamed("Dillan");
		 * System.out.println(estu9);
		 */

		/*
		 * List<Estudiante> estudianteLista =
		 * this.estudianteService.encontrarPorNombreQueryList("Dillan");
		 * 
		 * for (Estudiante p : estudianteLista) { System.out.println(p);
		 * 
		 * }
		 * 
		 * Estudiante estu10 =
		 * this.estudianteService.encontrarPorNombreQueryListPrimerElementoLista("Amely"
		 * ); System.out.println(estu10);
		 */

		/*
		 * List<EstudianteDTO> estu =
		 * this.estudianteService.encontrarPorNombreQueryTypeDTO("Amely"); for
		 * (EstudianteDTO estudianteDTO : estu) { System.out.println(estudianteDTO);
		 * 
		 * } System.out.println(); System.out.println("Criteria Api Query");
		 * List<Estudiante> estudianteCriterial =
		 * this.estudianteService.encontrarPorNombreCriterial("Dillan"); for (Estudiante
		 * criterial : estudianteCriterial) { System.out.println(criterial);
		 * 
		 * } System.out.println(); System.out.println("Criteria Api Dinamico");
		 * List<Estudiante> estudianteDinamico =
		 * this.estudianteService.encontrarPorNombreCriterialAndOr("Dillan", "Coloma",
		 * "F"); for (Estudiante criterial : estudianteDinamico) {
		 * System.out.println(criterial);
		 * 
		 * }
		 */
		/*
		 * int b =this.estudianteService.borrarPorApellido("Pozo");
		 * System.out.println(b);
		 * 
		 * int a = this.estudianteService.modificarPorApellido("Coloma", "Renato");
		 * System.out.println(a);
		 */

		// BORRAR

		/*
		 * int b = this.estudianteService.borrarPorApellido("Coloma");
		 * System.out.println("Registros elimanos por Apellido Coloma: " +b); int b1 =
		 * this.estudianteService.borrarPorCedula("100200500");
		 * System.out.println("Registros elimanos con cedula 100200500: "+b1);
		 */

		// ACTUALIZAR
		/*
		 * int a = this.estudianteService.modificarPorCedula("100200400", "Loja");
		 * System.out.println("Registros actualizado por cedula la ciudad: " +a); int a1
		 * = this.estudianteService.modificarPorCiudad("Cotopaxi",
		 * "caminatas Nocturnas");
		 * System.out.println("Registros actualizados por ciudad: "+a1);
		 */

		List<Hotel> hotel = this.hotelService.encontrarHotelInnerJoin("VIP");
		for (Hotel h : hotel) {
			System.out.println(h.getNombre());
			for (Habitacion ha : h.getHabitaciones()) {
				System.out.println("Las habitacion de: " + h.getNombre() + " es: " + ha.getNumero());

			}
		}

		/*System.out.println("LEFT JOIN");
		List<Hotel> hote2 = this.hotelService.encontrarHotelOuterLetfJoin("VIP");
		for (Hotel h : hote2) {
			System.out.println(h.getNombre());
			for (Habitacion ha : h.getHabitaciones()) {
				System.out.println("Las habitacion de: " + h.getNombre() + " es: " + ha.getNumero());
			}
		}*/
		/*System.out.println("RIGHT JOIN");
		List<Hotel> hote3 = this.hotelService.encontrarHotelOuterRightJoin("VIP");
		for (Hotel h : hote3) {
			System.out.println(h.getNombre());*/
			/*for (Habitacion ha : h.getHabitaciones()) {
				System.out.println("Las habitacion de: " + h.getNombre() + " es: " + ha.getNumero());
			}*/
		}
		/*
		 * List<Hotel> hote4 = this.hotelService.encontrarHotelOuterFullJoin("VIP"); for
		 * (Hotel h : hote4) { System.out.println(h); } List<Hotel> hote5 =
		 * this.hotelService.encontrarHotelFetchJoin("VIP"); for (Hotel h : hote5) {
		 * System.out.println(h); }
		 */
	

}
