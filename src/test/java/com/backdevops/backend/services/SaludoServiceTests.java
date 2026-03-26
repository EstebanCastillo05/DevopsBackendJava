package com.backdevops.backend.services;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class SaludoServiceTests {

    @Autowired
    private SaludoService saludoService;

    @Test
    void testObtenerSaludoReturnsCorrectMessage() {
        String resultado = saludoService.obtenerSaludo();
        assertEquals("Hola desde SpringBoot guardado de jar y envio a ", resultado);
    }

    @Test
    void testObtenerSaludoNotNull() {
        String resultado = saludoService.obtenerSaludo();
        assertNotNull(resultado);
    }
}