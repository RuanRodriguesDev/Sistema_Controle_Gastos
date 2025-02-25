package com.ruandev.br.projetogastos.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ruandev.br.projetogastos.dto.GastosDto;
import com.ruandev.br.projetogastos.entities.Gastos;
import com.ruandev.br.projetogastos.services.GastosService;

@RestController
@RequestMapping(value = "/gastos")
public class GastosController {
    private GastosService gastosService;

    public GastosController(GastosService gastosService) {
        this.gastosService = gastosService;
    }
    
    @PostMapping
    public ResponseEntity<GastosDto> saveGasto(@RequestBody Gastos gastos) {
        if (gastos == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        
        GastosDto savedGasto = (GastosDto) gastosService.salveGastos(gastos);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedGasto);
    }

    @GetMapping
    public ResponseEntity <List<Gastos>>list(){
        return ResponseEntity.ok().body(gastosService.allGastos());
    }
    
    
}
