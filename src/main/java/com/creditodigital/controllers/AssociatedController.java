package com.creditodigital.controllers;

import com.creditodigital.servicies.AssociatedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/associados")
public class AssociatedController {
    @Autowired
    private AssociatedService associatedService;
}
