package com.corenetworks;

import com.corenetworks.Ejercicio3.Modelo.Cliente;
import com.corenetworks.Ejercicio3.Persistencia.AccesoDesarrollo;
import com.corenetworks.modelo.conductor;
import com.corenetworks.modeloEjercicio2.CocheTaller;
import com.corenetworks.modeloEjercicio2.TallerMecanico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConceptosbasicosApplication implements CommandLineRunner {
	@Autowired
	private conductor c2;
	@Autowired
	private TallerMecanico tm;
	//@Autowired
	private CocheTaller cocheTaller;

	@Autowired
	private Cliente cliente;
	@Autowired
	private AccesoDesarrollo accesoDesarrollo;
	@Override
	public void run(String... args) throws Exception {

		//((coche) c2.getIVehiculo()).setDeposito(32);
        //System.out.println(c2.conducir());
		//System.out.println(tm.Reparar(cocheTaller));
		cliente.setNif("47657481k");
		cliente.setNombre("Rodolfo");
		//System.out.println(cliente.toString());
		System.out.println(accesoDesarrollo.insertar(cliente));


	}

	public static void main(String[] args) {
		SpringApplication.run(ConceptosbasicosApplication.class, args);


	}

}
