package com.corenetworks.modeloEjercicio2;

import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@NoArgsConstructor

@Component

public class TallerPintura implements ITaller
{

    @Override
    public String Reparar(CocheTaller cocheTaller) {
        return "Hay que pintar el ";
    }
}
