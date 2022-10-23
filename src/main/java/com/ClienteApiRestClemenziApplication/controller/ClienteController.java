package com.ClienteApiRestClemenziApplication.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ClienteApiRestClemenziApplication.model.ClienteModel;
import com.ClienteApiRestClemenziApplication.service.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    ClienteService clienteService;

    @GetMapping
    public ArrayList<ClienteModel> getClientes() {
        return clienteService.getClientes();
    }

    @PostMapping()
    public ClienteModel setCliente(@RequestBody ClienteModel cliente) {
        return this.clienteService.setCliente(cliente);
    }
}
