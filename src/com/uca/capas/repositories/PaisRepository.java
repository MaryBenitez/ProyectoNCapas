package com.uca.capas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uca.capas.domain.Pais;

@Repository
public interface PaisRepository extends JpaRepository<Pais, Integer> {

}
