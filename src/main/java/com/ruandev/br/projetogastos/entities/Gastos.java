package com.ruandev.br.projetogastos.entities;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Gastos {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private BigDecimal valor;
    private LocalDate date;
    private String catregoria;

    public Gastos(){}

    public Gastos(Long id, String nome, BigDecimal valor, LocalDate date, String catregoria) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
        this.date = date;
        this.catregoria = catregoria;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getCatregoria() {
        return catregoria;
    }

    public void setCatregoria(String catregoria) {
        this.catregoria = catregoria;
    }

    
}
