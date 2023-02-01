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
		Estudiante estudiante = new Estudiante();
		estudiante.setNombre("Dillan");
		estudiante.setApellido("Coloma");
		estudiante.setCedula("1751457167");
		estudiante.setFechaNacimiento(LocalDateTime.of(1998, 8, 31, 24, 0));
		estudiante.setCiudad("Quito");
		
		Estudiante estudiante1 = new Estudiante();
		estudiante1.setNombre("Israel");
		estudiante1.setApellido("Coloma");
		estudiante1.setCedula("1718674649");
		estudiante1.setFechaNacimiento(LocalDateTime.of(1996, 8, 28, 24, 0));
		estudiante1.setCiudad("Quito");
		
		//Insertar
		
		//Consulta
		Estudiante estu =  this.estudianteService.encontrarPorNombre("Dillan");
		System.out.println(estu);
		
		//Consulta
		/*Estudiante estu1 =  this.estudianteService.encontrarPorApellido("Coloma");
		System.out.println(estu1);*/
	}

}
