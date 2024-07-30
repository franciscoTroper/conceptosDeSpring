package com.corenetworks.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Component
public class conductor implements IVehiculo
{
    @Autowired
    private IVehiculo iVehiculo;
    public String conducir()
    {
        return "El conductor tiene un " +iVehiculo.moverse();
    }


    @Override
    public String moverse() {
        return "";
    }
}
