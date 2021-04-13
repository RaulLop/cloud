package com.fomacionbdi.springboot.app.item.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fomacionbdi.springboot.app.item.clientes.ProductoClienteRest;
import com.fomacionbdi.springboot.app.item.models.Item;

@Service("serviceFeing")
public class ItemServiceFeing implements ItemService {
	
	@Autowired
	private ProductoClienteRest clieteFeing;

	@Override
	public List<Item> findAll() {
		return clieteFeing.listar().stream().map(p  -> new Item(p,1)).collect(Collectors.toList());
	}

	@Override
	public Item findById(Long id, Integer cantidad) {
		return new Item(clieteFeing.detalle(id), cantidad);
	}

}
