/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tienda.dao;

import com.tienda.domain.Venta;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface VentaDAO extends JpaRepository <Venta,Long> {
    
    //Ejemplo de método utilizando Consultas con SQL nativo
    @Query(nativeQuery = true,
            value = "SELECT * FROM venta where venta.cantidad >= :cantidadDeseada")
    public List<Venta> metodoNativo(@Param("cantidadDeseada") int cantidadDeseada);
}
