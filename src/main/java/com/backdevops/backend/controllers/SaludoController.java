package com.backdevops.backend.controllers;

import com.backdevops.backend.services.SaludoService;
import org.springframework.beans.factory.annotation.Value; 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/devops")
public class SaludoController {

    private final SaludoService saludoService;

    @Value("${app.entorno.nombre:Desconocido}")
    private String entornoNombre;

    public SaludoController(SaludoService saludoService) {
        this.saludoService = saludoService;
    }

    @GetMapping("/saludo")
    public String decirHola() {
        return saludoService.obtenerSaludo();
    }
}