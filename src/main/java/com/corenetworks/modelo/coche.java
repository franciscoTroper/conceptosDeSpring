package com.corenetworks.modelo;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Component
public class coche implements IVehiculo
{

    @Value("35")
    int deposito;

    @Override
    public String moverse()
    {
        if (deposito>0) {return "coche y se está moviendose";}
        else {return "coche sin gasolina";}
    }
}
