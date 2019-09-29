package com.springboot.app.productos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.app.productos.models.entity.Producto;
import com.springboot.app.productos.models.services.IProductoService;

@RestController
@RequestMapping("/servicio/producto")
public class ProductoRestController {
	
	@Autowired
	private IProductoService productoService;
	
	@GetMapping("/listar")
	public List<Producto> listar(){
		return productoService.findAll();
	}
	
	@PostMapping("/buscar ")
	public Producto buscar(@RequestParam("id") Long id) {
		return productoService.findById(id);
	}

}
