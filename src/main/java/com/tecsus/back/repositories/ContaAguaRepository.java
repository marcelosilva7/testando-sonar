package com.tecsus.back.repositories;

import com.tecsus.back.models.ContaAgua;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContaAguaRepository extends JpaRepository<ContaAgua,Long> {
}
