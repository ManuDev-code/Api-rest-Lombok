package com.proyecto.api_rest_spring.model.dao;

import com.proyecto.api_rest_spring.model.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteDao extends CrudRepository<Cliente, Integer> {
}
