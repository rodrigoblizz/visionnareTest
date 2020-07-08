package com.visionnareTest1.visionnareTest1.services;

import com.visionnareTest1.visionnareTest1.domain.Produto;
import com.visionnareTest1.visionnareTest1.repository.ProdutoRepository;
import com.visionnareTest1.visionnareTest1.services.exception.DataIntegrityException;
import com.visionnareTest1.visionnareTest1.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository repo;


    public Produto find(Integer id) {
        Optional<Produto> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Produto não encontrado! Id: " + id));
    }


    public Produto insert(Produto obj) {
        obj.setId(null);
        return repo.save(obj);
    }

    public Produto update(Produto obj) {
        find(obj.getId());
        return repo.save(obj);
    }

    public void delete(Integer id){
        find(id);
        try {
            repo.deleteById(id);
        } catch (DataIntegrityViolationException e){
            throw new DataIntegrityException("Não foi possível excluir o Produto");
        }
    }

    public List<Produto> findAll(){
        return repo.findAll();
    }
}
