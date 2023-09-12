package com.creditodigital.controllers;

import com.creditodigital.dtos.AssociatedDTO;
import com.creditodigital.dtos.UserDTO;
import com.creditodigital.entities.Associated;
import com.creditodigital.servicies.AssociatedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/associados")
public class AssociatedController {
    @Autowired
    private AssociatedService associatedService;

    @GetMapping(value = "/{id}")
    public AssociatedDTO findById(@PathVariable Long id){
        return associatedService.findById(id);
    }

    @PostMapping("/insert/associated")
    public ResponseEntity<AssociatedDTO> insertAssociated(@RequestBody Associated associated){
        Associated novoAssociated = associatedService.registerAssociated(associated);
        return ResponseEntity.ok(new AssociatedDTO(novoAssociated));
    }
}
