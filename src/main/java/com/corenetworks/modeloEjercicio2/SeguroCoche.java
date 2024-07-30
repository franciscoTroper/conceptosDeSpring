package com.corenetworks.modeloEjercicio2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Component
public class SeguroCoche
{
     private  String aseguradora;
     @Autowired
     private  ITaller iTaller;


    public String reparar(CocheTaller cocheTaller)
    {
        return  cocheTaller.getModelo() +". Su matricula es "+ cocheTaller.getMatricula() + ". Su seguro es " + aseguradora +
                ". Necesita ir al " +iTaller.toString();
    }


}
