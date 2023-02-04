package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Estudiante;
import com.example.demo.service.IEstudianteService;

@SpringBootApplication
public class ProyectoPaU3DcApplication implements CommandLineRunner {

	@Autowired
	private IEstudianteService estudianteService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU3DcApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		/*Estudiante estudiante = new Estudiante();
		estudiante.setNombre("Dillan");
		estudiante.setApellido("Coloma");
		estudiante.setCedula("1751457167");
		estudiante.setHobby("futbol");
		estudiante.setGenero("M");
		estudiante.setFechaNacimiento(LocalDateTime.now());
		estudiante.setCiudad("Quito");
		
		Estudiante estudiante1 = new Estudiante();
		estudiante1.setNombre("Amely");
		estudiante1.setApellido("Pozo");
		estudiante1.setCedula("1718674649");
		estudiante1.setHobby("ver anime");
		estudiante1.setGenero("F");
		estudiante1.setFechaNacimiento(LocalDateTime.now());
		estudiante1.setCiudad("Guayaquil");*/
		
		//Insertar
		//this.estudianteService.agregar(estudiante);
		//this.estudianteService.agregar(estudiante1);
		
		//Consulta
		System.out.println("CONSULTA POR NOMBRE");
		Estudiante estu =  this.estudianteService.encontrarPorNombre("Dillan");
		System.out.println(estu);
	    System.out.println();
		//Consulta
		/*System.out.println("CONSULTA POR APELLIDO");
		Estudiante estu1 =  this.estudianteService.encontrarPorApellido("Pozo");
		System.out.println(estu1);
		System.out.println();*/
		//Consulta
		/*System.out.println("CONSULTA POR GENERO");
		Estudiante estu2 = this.estudianteService.encontrarPorGenero("M");
		System.out.println(estu2);
		System.out.println();*/
		//Consulta
		/*System.out.println("CONSULTA POR CEDULA");
		Estudiante estu3 = this.estudianteService.encontrarPorCedula("1718674649");
		System.out.println(estu3);
		System.out.println();*/
		//Consulta
		/*System.out.println("CONSULTA POR CIUDAD");
		Estudiante estu4 = this.estudianteService.encontrarPorCiudad("Guayaquil");
		System.out.println(estu4);
		System.out.println();*/
		//Consulta
		System.out.println("CONSULTA POR NOMBRE Type Query");
		Estudiante estu5 = this.estudianteService.encontrarPorNombreQueryType("Dillan");
		System.out.println(estu5);
		System.out.println();
		//Consulta
		System.out.println("CONSULTA POR NOMBRE Named Query");
		Estudiante estu6 = this.estudianteService.encontrarPorNombreNamedQuery("Amely");
		System.out.println(estu6);
		System.out.println();
		//Consulta
		System.out.println("CONSULTA POR NOMBRE Named Query Type");
		Estudiante estu7 = this.estudianteService.encontrarPorNombreNamedQueryType("Dillan");
		System.out.println(estu7);
		//Consulta
		System.out.println("CONSULTA POR NOMBRE Native Query");
		Estudiante estu8 = this.estudianteService.encontrarrPorNombreNativeQuery("Dillan");
		System.out.println(estu8);
		//Consulta
		/*System.out.println("CONSULTA POR NOMBRE NativeTypeNamed");
		Estudiante estu9 = this.estudianteService.encontrarPorNombreNativeTypeNamed("Dillan");
		System.out.println(estu9);	
		*/
		
	}

}
