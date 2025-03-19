/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="venta")
public class Venta implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_venta")
    private int id_venta;
    private int id_factura;
    private int id_producto;
    private double precio;
    private int cantidad;


    public Venta() {
    }

    public Venta(double precio, int cantidad) {
        this.precio = precio;
        this.cantidad = cantidad;
    }
    
}
