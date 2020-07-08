package com.visionnareTest1.visionnareTest1.repository;

import com.visionnareTest1.visionnareTest1.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
