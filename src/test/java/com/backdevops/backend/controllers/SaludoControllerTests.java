package com.backdevops.backend.controllers;

import com.backdevops.backend.services.SaludoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class SaludoControllerTests {

    @Autowired
    private TestRestTemplate restTemplate;

    @Autowired
    private SaludoService saludoService;

    @Test
    void testDecirHolaEndpointReturnsOk() {
        ResponseEntity<String> response = restTemplate.getForEntity("/devops/saludo", String.class);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals("Hola desde SpringBoot", response.getBody());
    }

    @Test
    void testDecirHolaEndpointNotNull() {
        ResponseEntity<String> response = restTemplate.getForEntity("/devops/saludo", String.class);
        assertNotNull(response.getBody());
    }

    @Test
    void testSaludoServiceReturnsCorrectMessage() {
        String resultado = saludoService.obtenerSaludo();
        assertEquals("Hola desde SpringBoot", resultado);
    }
}

