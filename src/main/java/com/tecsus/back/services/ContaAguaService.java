package com.tecsus.back.services;

import com.tecsus.back.models.ContaAgua;
import com.tecsus.back.repositories.ContaAguaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContaAguaService {

    private ContaAguaRepository contaAguaRepository;

    public ContaAguaService(ContaAguaRepository contaAguaRepository) {
        this.contaAguaRepository = contaAguaRepository;
    }

    public List<ContaAgua> findall(){
        return contaAguaRepository.findAll();
    }
}
