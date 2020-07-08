package com.visionnareTest1.visionnareTest1.services;

import com.visionnareTest1.visionnareTest1.domain.Cliente;
import com.visionnareTest1.visionnareTest1.domain.Produto;
import com.visionnareTest1.visionnareTest1.repository.ProdutoRepository;
import com.visionnareTest1.visionnareTest1.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository repo;


    public Produto buscar(Integer id) {
        Optional<Produto> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Produto não encontrado! Id: " + id));
    }
}
