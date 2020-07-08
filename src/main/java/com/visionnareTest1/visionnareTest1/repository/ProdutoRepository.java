package com.visionnareTest1.visionnareTest1.repository;

import com.visionnareTest1.visionnareTest1.domain.Cliente;
import com.visionnareTest1.visionnareTest1.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
}
