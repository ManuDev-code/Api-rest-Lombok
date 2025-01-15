package com.proyecto.api_rest_spring.service;

import com.proyecto.api_rest_spring.model.dto.ClienteDto;
import com.proyecto.api_rest_spring.model.entity.Cliente;

public interface ICliente {

    Cliente save(ClienteDto cliente);

    Cliente findById(Integer id);

    void delete(Cliente cliente);
}
