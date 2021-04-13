package com.fomacionbdi.springboot.app.productos.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.fomacionbdi.springboot.app.productos.models.entity.Producto;

public interface ProductoRepository extends CrudRepository<Producto, Long> {

}
