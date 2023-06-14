package com.formacionbdi.springboot.app.items2.models.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.formacionbdi.springboot.app.items2.clientes.ProductoClienteRest;
import com.formacionbdi.springboot.app.items2.models.Item;

@Service("serviceFeign")
@Primary
public class ItemServiceFeign implements ItemService {

	@Autowired
	private ProductoClienteRest  clienteFeign;

	@Override
	public List<Item> findAll() {
		return clienteFeign.listar().stream().map(p -> new Item (p,1)).collect(Collectors.toList());
	}

	@Override
	public Item findById(Long id, Integer cantidad) {
		return new Item(clienteFeign.detalle(id),cantidad);
	}

}