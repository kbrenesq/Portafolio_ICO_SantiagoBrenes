/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.service.impl;

import com.tienda.dao.VentaDAO;
import com.tienda.domain.Venta;
import com.tienda.service.VentaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author santi
 */
@Service
public class VentaServiceImpl implements VentaService{
    
    @Autowired
    private VentaDAO ventaDAO;

    @Override
    @Transactional(readOnly=true)
    public List<Venta> getVentas() {
        var ventas = ventaDAO.findAll();
        
        return ventas;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Venta> metodoNativo(int cantidadDeseada) {
        return ventaDAO.metodoNativo(cantidadDeseada);
    }
    
}
