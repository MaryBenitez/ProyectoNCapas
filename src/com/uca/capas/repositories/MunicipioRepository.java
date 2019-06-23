package com.uca.capas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uca.capas.domain.Municipio;

@Repository
public interface MunicipioRepository extends JpaRepository<Municipio, Integer> {

}
