package com.creditodigital.servicies;

import com.creditodigital.repositories.AssociadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AssociadoService {
    @Autowired
    private AssociadoRepository associadoRepository;
}
