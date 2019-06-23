package com.uca.capas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uca.capas.domain.Formato;

@Repository
public interface FormatoRepository extends JpaRepository<Formato, Integer>{

}
