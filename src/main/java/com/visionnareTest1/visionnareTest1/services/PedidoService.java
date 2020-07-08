package com.visionnareTest1.visionnareTest1.services;

import com.visionnareTest1.visionnareTest1.domain.Pedido;
import com.visionnareTest1.visionnareTest1.repository.PedidoRepository;
import com.visionnareTest1.visionnareTest1.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PedidoService {
    @Autowired
    private PedidoRepository repo;


    public Pedido find(Integer id) {
        Optional<Pedido> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Pedido não encontrado! Id: " + id));
    }
}
