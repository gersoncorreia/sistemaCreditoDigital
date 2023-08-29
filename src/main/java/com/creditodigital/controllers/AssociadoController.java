package com.creditodigital.controllers;

import com.creditodigital.servicies.AssociadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/associados")
public class AssociadoController {
    @Autowired
    private AssociadoService associadoService;
}
