/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tienda.service;

import com.tienda.domain.Venta;
import java.util.List;

/**
 *
 * @author santi
 */
public interface VentaService {
    public List<Venta> getVentas();
    
    
    //Lista de productos utilizando consultas con SQL Nativo
    public List<Venta> metodoNativo(int cantidadDeseada);
}
