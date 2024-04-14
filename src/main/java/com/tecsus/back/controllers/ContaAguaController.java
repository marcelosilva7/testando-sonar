package com.tecsus.back.controllers;


import com.tecsus.back.models.ContaAgua;
import com.tecsus.back.services.ContaAguaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;

@RestController
@CrossOrigin("*")
@RequestMapping("/conta_agua")
public class ContaAguaController {

    private ContaAguaService contaAguaService;

    public ContaAguaController(ContaAguaService contaAguaService) {
        this.contaAguaService = contaAguaService;
    }

    @GetMapping
    public ResponseEntity<List<ContaAgua>> findall(){
        return ResponseEntity.status(HttpStatus.OK).body(contaAguaService.findall());
    }
}
