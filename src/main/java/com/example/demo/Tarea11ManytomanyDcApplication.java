package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Cliente;
import com.example.demo.modelo.Renta;
import com.example.demo.modelo.Vehiculo;
import com.example.demo.repository.IVehiculoRepository;
import com.example.demo.service.IClienteService;
import com.example.demo.service.IRentaService;
import com.example.demo.service.IVehiculoService;

@SpringBootApplication
public class Tarea11ManytomanyDcApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Tarea11ManytomanyDcApplication.class, args);
	}

	@Autowired
	private IClienteService clienteService;
	
	@Autowired
	private IVehiculoService iVehiculoService;
	
	@Autowired
	private IRentaService iRentaService;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		List<Cliente> clienteLista = new  ArrayList<>();
		List<Vehiculo> vehiculoLista = new ArrayList<>();
		List<Renta> rentaLista = new ArrayList<>();
		
		Cliente cliente = new Cliente();
		cliente.setNombre("Israel");
		cliente.setApellido("Coloma");
		cliente.setDireccion("Tumbaco, la Esperanza");
		cliente.setCedula("1725247645");
		clienteLista.add(cliente);
		
		Vehiculo vehiculo = new Vehiculo();
		vehiculo.setPlaca("PTV0553");
		vehiculo.setMarca("Peugeot");
		vehiculo.setModelo("berlina 306");
		vehiculo.setColor("plateado");
		vehiculo.setTipo("sedan");
		vehiculoLista.add(vehiculo);
		
		this.clienteService.agregar(cliente);
		this.iVehiculoService.agregar(vehiculo);
		
		
		//CONSULTO el cliente y vehiculo
		Cliente cliente1= this.clienteService.encontrarQuery("1725247645");
		System.out.println(cliente1);
		Vehiculo veh = this.iVehiculoService.encontrar("PTV0553");
		System.out.println(veh);
		
		//Establecer la renta
		/*Renta renta = new Renta();
		renta.setFecha(LocalDateTime.now());
		renta.setNumeroDias(12);
		renta.setValor(new BigDecimal(12.5));*/
		
		//Asociar la renta a los vehiculos y al cliente
		/*renta.setClientes(cliente);
		renta.setVehiculos(vehiculo);*/
		//Agragar la renta a una lista de rentas
		/*rentaLista.add(renta);*/
		
		//Asociar el vehiculo y el cliente a la renta
		vehiculo.setRentas(rentaLista);
		vehiculo.setRentas(rentaLista);
		
		
		
		 //this.iRentaService.agregar(renta);
		 this.iRentaService.rentar("1725247645", "PTV0553");
		
		
		
		
	}

}
