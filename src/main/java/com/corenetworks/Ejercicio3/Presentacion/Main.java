package com.corenetworks.Ejercicio3.Presentacion;

import com.corenetworks.Ejercicio3.Modelo.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

public class Main implements CommandLineRunner {
    @Autowired
    private Cliente cliente;
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
        cliente.setNombre("Fran");
        cliente.setNif("3838373J");
        System.out.println(cliente.toString());
    }
}
