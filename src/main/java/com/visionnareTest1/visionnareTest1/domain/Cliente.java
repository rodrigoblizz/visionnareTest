package com.visionnareTest1.visionnareTest1.domain;

import java.io.Serializable;
import java.util.Objects;

public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;
    private String nome;
    private String cpf;
    private String nascimento;


    public Cliente(){
    }

    public Cliente(int id, String nome, String cpf, String nascimento){
        super();
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.nascimento = nascimento;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return id == cliente.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
