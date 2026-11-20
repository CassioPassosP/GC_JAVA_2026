package com.example.demo.services;

import com.example.demo.domain.entities.Soldier;
import com.example.demo.exceptions.SoldierNotFoundException;
import com.example.demo.repositories.SoldierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class SoldierService {

    private final SoldierRepository repository;

    public SoldierService(SoldierRepository repository) {
        this.repository = repository;
    }

    public Soldier findSoldierById(UUID soldierId){
        return repository.findById(soldierId)
                .orElseThrow(() -> new SoldierNotFoundException("could´nt found soldier."));
    }

    public Soldier createNewSoldier(Soldier data){
        Soldier newSoldier = new Soldier(
                data.getName(),
                data.getType()
        );
        return repository.save(newSoldier);
    }

    public Optional<Soldier> deleteSoldierById (UUID soldierId){
        repository.findById(soldierId).ifPresent(repository::delete);
        return Optional.empty();
    }

    public void updateSoldierById (UUID soldierId){

    }


}
