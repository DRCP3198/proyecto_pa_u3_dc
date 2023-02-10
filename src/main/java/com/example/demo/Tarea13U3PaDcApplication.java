package com.example.demo;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Automovil;
import com.example.demo.service.IAutomovilService;

@SpringBootApplication
public class Tarea13U3PaDcApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Tarea13U3PaDcApplication.class, args);
	}

	@Autowired
	private IAutomovilService automovilService;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		Automovil automovil = new  Automovil();
		
		automovil.setMarca("KIA");
		automovil.setModelo("rio");
		automovil.setPlaca("POP812");
		automovil.setColor("Dorado");
		automovil.setPrecio(new BigDecimal(16000));
		automovil.setCilindaje("1400");
		automovil.setTipo("sedan");
		
        Automovil automovil1 = new  Automovil();
		
		automovil1.setMarca("PEUGEOT");
		automovil1.setModelo("306");
		automovil1.setPlaca("PTV0553");
		automovil1.setColor("Plateado");
		automovil1.setPrecio(new BigDecimal(8000));
		automovil1.setCilindaje("1800");
		automovil1.setTipo("sedan");
		

        Automovil automovil2 = new  Automovil();
		
		automovil2.setMarca("HYUNDAY");
		automovil2.setModelo("sonata");
		automovil2.setPlaca("PMB8525");
		automovil2.setColor("Blanco");
		automovil2.setPrecio(new BigDecimal(28000));
		automovil2.setCilindaje("2500");
		automovil2.setTipo("sedan");
		
		//this.automovilService.agregar(automovil2);
		//this.automovilService.agregar(automovil1);
		System.out.println("TYPED QUERY");
		Automovil a=this.automovilService.encontrarPlacaTyped("POP812");
		System.out.println(a);
		Automovil a1=this.automovilService.encontrarModeloTyped("306");
		System.out.println(a1);
		Automovil a2=this.automovilService.encontrarPrecioTyped(new BigDecimal(8000));
		System.out.println(a2);
		System.out.println();
		
		System.out.println("NAMED QUERY QUERY");
		Automovil a3=this.automovilService.encontrarColorNamedQuery("Dorado");
		System.out.println(a3);
		Automovil a4=this.automovilService.encontrarPlacaNamedQuery("POP812");
		System.out.println(a4);
		List<Automovil> autoLista=this.automovilService.encontrarTipoNamedQuery("sedan");
		for (Automovil aut : autoLista) {
			System.out.println(aut);
		}
		System.out.println();
		
		System.out.println("NATIVE QUERY ");
		Automovil a5 = this.automovilService.encontrarCilindajeNativeQuery("1400");
		System.out.println(a5);
		Automovil a6 = this.automovilService.encontrarColorNativeQuery("Plateado");
		System.out.println(a6);
		Automovil a7 = this.automovilService.encontrarPlacaNativeQuery("PTV0553");
		System.out.println(a7);
		System.out.println();
		System.out.println("NAMED NATIVE QUERY ");
		Automovil a8 = this.automovilService.encontrarPlacaNamedNativeQuery("PTV0553");
		System.out.println(a8);
		System.out.println();
		List<Automovil> autoLista1= this.automovilService.encontrarTipoNamedNativeQuery("sedan");
		for (Automovil aut : autoLista1) {
			System.out.println(aut);
		}
		Automovil a9 = this.automovilService.encontrarCilindajeNamedNativeQuery("2500");
		System.out.println(a9);
		System.out.println();
		
		
		
	
		
	}

}
