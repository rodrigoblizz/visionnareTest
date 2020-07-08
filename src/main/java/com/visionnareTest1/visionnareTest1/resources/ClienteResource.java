package com.visionnareTest1.visionnareTest1.resources;

import com.visionnareTest1.visionnareTest1.domain.Cliente;
import com.visionnareTest1.visionnareTest1.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteResource {

    @Autowired
    private ClienteService service;

    @RequestMapping(value ="/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> find(@PathVariable Integer id){

        Cliente obj = service.buscar(id);

        return ResponseEntity.ok().body(obj);
    }
}
