package com.creditodigital.servicies;

import com.creditodigital.dtos.AssociatedDTO;
import com.creditodigital.entities.Associated;
import com.creditodigital.repositories.AssociatedRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AssociatedService {
    @Autowired
    private AssociatedRepository associatedRepository;
    public AssociatedDTO findById(Long id){
        Associated entity = associatedRepository.findById(id).get();
        return new AssociatedDTO(entity);
    }

    public Associated registerAssociated(Associated associated){
        return associatedRepository.save(associated);
    }

}
