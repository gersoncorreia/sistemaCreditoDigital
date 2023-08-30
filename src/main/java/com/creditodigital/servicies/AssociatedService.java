package com.creditodigital.servicies;

import com.creditodigital.repositories.AssociatedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AssociatedService {
    @Autowired
    private AssociatedRepository associatedRepository;
}
