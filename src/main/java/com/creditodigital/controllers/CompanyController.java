package com.creditodigital.controllers;

import com.creditodigital.servicies.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/empresas")
public class CompanyController {
    @Autowired
    private CompanyService companyService;
}
