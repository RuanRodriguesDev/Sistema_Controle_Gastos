package com.ruandev.br.projetogastos.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ruandev.br.projetogastos.dto.GastosDto;
import com.ruandev.br.projetogastos.entities.Gastos;
import com.ruandev.br.projetogastos.repositorie.GastosRepository;

@Service
public class GastosService {
    private GastosRepository gastosRepository;

    public GastosService(GastosRepository gastosRepository) {
        this.gastosRepository = gastosRepository;
    }
     
   public GastosDto salveGastos(Gastos gastos) {
    Gastos savedGasto = gastosRepository.save(gastos);
    return new GastosDto(savedGasto);
}

public List<Gastos> allGastos() {
    List<Gastos> findGasto = gastosRepository.findAll();
    return findGasto;
}



}
