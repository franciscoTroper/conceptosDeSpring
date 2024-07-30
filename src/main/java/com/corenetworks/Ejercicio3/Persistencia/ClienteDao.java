package com.corenetworks.Ejercicio3.Persistencia;

import com.corenetworks.Ejercicio3.Modelo.Cliente;

public class ClienteDao {
    private IDAO idao;

    public String insertar(Cliente cliente)
    {
        return  idao.insertar(cliente);
    }


}
