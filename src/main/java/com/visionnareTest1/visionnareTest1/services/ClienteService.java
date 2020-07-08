package com.visionnareTest1.visionnareTest1.services;
import java.util.Optional;

import com.visionnareTest1.visionnareTest1.domain.Cliente;
import com.visionnareTest1.visionnareTest1.repository.ClienteRepository;
import com.visionnareTest1.visionnareTest1.services.exception.DataIntegrityException;
import com.visionnareTest1.visionnareTest1.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository repo;


    public Cliente find(Integer id) {
        Optional<Cliente> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Cliente não encontrado! Id: " + id));
    }

    public Cliente insert(Cliente obj) {
        obj.setId(null);
        return repo.save(obj);
    }

    public Cliente update(Cliente obj) {
        find(obj.getId());
        return repo.save(obj);
    }

    public void delete(Integer id){
        find(id);
        try {
            repo.deleteById(id);
        } catch (DataIntegrityViolationException e){
            throw new DataIntegrityException("Não foi possível excluir o cliente");
        }
    }

}
