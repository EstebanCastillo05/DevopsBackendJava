package com.backdevops.backend.controllers;

import com.backdevops.backend.services.SaludoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/devops")
public class SaludoController {

    private final SaludoService saludoService;

    public SaludoController(SaludoService saludoService) {
        this.saludoService = saludoService;
    }

    @GetMapping("/saludo")
    public String decirHola() {
        return saludoService.obtenerSaludo();
    }
}