/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.controller;

import com.tienda.service.VentaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Slf4j
@RequestMapping("/ventas")
public class VentaController {

    @Autowired
    private VentaService ventaService;

    @GetMapping("")
    public String inicio(Model model) {
        var ventas = ventaService.getVentas();
        model.addAttribute("ventas", ventas);
        model.addAttribute("totalVentas", ventas.size());
        return "ventas/lista";
    }

    @PostMapping("/query_cantidad_ventas")
    public String consultaQuery1(@RequestParam(value = "cantidadDeseada") int cantidadDeseada, Model model) {
        var ventas = ventaService.metodoNativo(cantidadDeseada);
        model.addAttribute("ventas", ventas);
        model.addAttribute("totalVentas", ventas.size());
        model.addAttribute("cantidadDeseada", cantidadDeseada);
        return "/ventas/lista";
    }
}
