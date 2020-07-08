package com.visionnareTest1.visionnareTest1;

import com.visionnareTest1.visionnareTest1.domain.Cliente;
import com.visionnareTest1.visionnareTest1.domain.Produto;
import com.visionnareTest1.visionnareTest1.repository.ClienteRepository;
import com.visionnareTest1.visionnareTest1.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class VisionnareTest1Application implements CommandLineRunner {

	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private ProdutoRepository produtoRepository;

	public static void main(String[] args) {
		SpringApplication.run(VisionnareTest1Application.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		//** insert clientes

		//Cliente c1 = new Cliente(null,"Rodrigo","02410687032","1992-01-01");
		//Cliente c2 = new Cliente(null,"Caroline","02410687033","1992-01-01");
		//clienteRepository.saveAll(Arrays.asList(c1, c2));


		//** insert produtos

		//Produto p1 = new Produto(null, "ABC1243", "Computador", "CPU Intel core i7-7700k", 7000.0, 5);
		//Produto p2 = new Produto(null, "ABC1243", "Computador", "CPU Intel core i5-5600", 500.0, 10);
		//produtoRepository.saveAll(Arrays.asList(p1, p2));
	}
}
