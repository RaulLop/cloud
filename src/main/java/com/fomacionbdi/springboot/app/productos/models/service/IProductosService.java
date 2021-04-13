package com.fomacionbdi.springboot.app.productos.models.service;

import java.util.List;

import com.fomacionbdi.springboot.app.productos.models.entity.Producto;

public interface IProductosService {
	
	public List<Producto>findAll();
	public Producto findById(Long id);

}
