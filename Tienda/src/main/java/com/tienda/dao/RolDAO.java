package com.tienda.dao;


import com.tienda.domain.Rol;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolDAO extends JpaRepository<Rol, Long> {
}
