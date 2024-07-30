package com.corenetworks.Ejercicio3.Persistencia;

import com.corenetworks.Ejercicio3.Modelo.Cliente;
import org.springframework.stereotype.Component;

@Component
public class AccesoDesarrollo implements IDAO{
    @Override
    public String insertar(Cliente c1) {
        return c1.toString();
    }
}
