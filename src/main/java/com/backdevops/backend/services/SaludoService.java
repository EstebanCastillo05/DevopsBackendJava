package com.backdevops.backend.services;

import org.springframework.stereotype.Service;

@Service
public class SaludoService {

    public String obtenerSaludo() {
        return "Hola desde SpringBoot prueba de artefacto para build";
    }
}