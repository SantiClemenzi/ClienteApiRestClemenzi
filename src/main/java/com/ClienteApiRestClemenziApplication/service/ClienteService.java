package com.ClienteApiRestClemenziApplication.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ClienteApiRestClemenziApplication.model.ClienteModel;
import com.ClienteApiRestClemenziApplication.repository.ClienteRepository;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    public ArrayList<ClienteModel> getClientes() {
        return (ArrayList<ClienteModel>) clienteRepository.findAll();
    }

    public ClienteModel setCliente(ClienteModel cliente) {
        return clienteRepository.save(cliente);
    }
}
