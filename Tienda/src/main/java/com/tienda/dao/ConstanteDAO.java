package com.tienda.dao;

import com.tienda.domain.Constante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConstanteDAO
        extends JpaRepository<Constante, Long> {

    public Constante findByAtributo(String stributo);
}

