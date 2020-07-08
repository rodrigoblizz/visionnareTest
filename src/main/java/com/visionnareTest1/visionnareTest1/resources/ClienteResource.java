package com.visionnareTest1.visionnareTest1.resources;

import com.visionnareTest1.visionnareTest1.domain.Cliente;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteResource {
    @RequestMapping(method = RequestMethod.GET)
    public List<Cliente> listar(){

        Cliente c1 = new Cliente(1, "a", "a", "a");
        Cliente c2 = new Cliente(1, "a", "a", "a");

        List<Cliente> lista = new ArrayList<>();
        lista.add(c1);
        lista.add(c2);

        return lista;
    }
}
