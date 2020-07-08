package com.visionnareTest1.visionnareTest1.services;
import java.util.Optional;

import com.visionnareTest1.visionnareTest1.domain.Cliente;
import com.visionnareTest1.visionnareTest1.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository repo;


    public Cliente buscar(Integer id) {
        Optional<Cliente> obj = repo.findById(id);
        return obj.orElse(null);
    }
}
