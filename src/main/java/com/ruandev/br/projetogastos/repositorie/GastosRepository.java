package com.ruandev.br.projetogastos.repositorie;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ruandev.br.projetogastos.entities.Gastos;

public interface GastosRepository extends JpaRepository<Gastos ,Long> {
    
}
