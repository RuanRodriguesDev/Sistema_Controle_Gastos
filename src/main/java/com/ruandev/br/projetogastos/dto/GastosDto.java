package com.ruandev.br.projetogastos.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.ruandev.br.projetogastos.entities.Gastos;

public class GastosDto {
    private Long id;
    private String nome;
    private BigDecimal valor;
    private LocalDate date;
    private String categoria;

    public GastosDto(Gastos gastos) {
        this.id = gastos.getId();
        this.nome = gastos.getNome();
        this.valor = gastos.getValor();
        this.date = gastos.getDate();
        this.categoria = gastos.getCategoria();
    }

    // ✅ Getters e Setters
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

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
