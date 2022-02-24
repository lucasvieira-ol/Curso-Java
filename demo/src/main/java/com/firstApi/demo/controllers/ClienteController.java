package com.firstApi.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.firstApi.demo.model.entities.Cliente;

@RestController
@RequestMapping(path = "/clientes")
public class ClienteController {

	@GetMapping(path ="/qualquer")
	public Cliente obterCliente() {
		return new Cliente(28, "Lucas Oliveira", "489.123.134-85");
	}
	
	@GetMapping(path="/{id}")
	public Cliente obterClientePorId1(@PathVariable int id) {
		return new  Cliente(id, "Lucas Oliveira", "123.123.123-00");
	}
	
	@GetMapping()
	public Cliente obterClientePorId2(@RequestParam(name = "id", defaultValue = "1") int id) {
		return new  Cliente(id, "Lucas Oliveira", "123.123.123-00");
	}
}
