package com.backdevops.backend.services;

import org.springframework.stereotype.Service;

@Service
public class SaludoService {

    public String obtenerSaludo() {
        return "Hola desde SpringBoot guardado de jar"; // Prueba de saludo para verificar que el servicio funciona correctamente
    }
}