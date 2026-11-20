package com.example.demo.controllers;

import com.example.demo.domain.entities.Soldier;
import com.example.demo.services.SoldierService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/aotapi/soldiers")
public class SoldierController {
    private final SoldierService service;

    public SoldierController(SoldierService service) {
        this.service = service;
    }

    @GetMapping("/{soldierId}")
    public ResponseEntity<Soldier> getSoldierById(@PathVariable UUID soldierId) {
        return ResponseEntity.ok(service.findSoldierById(soldierId));
    }

    @PostMapping("/create")
    public ResponseEntity<Soldier> createNewSoldier(@RequestBody Soldier data){
        return ResponseEntity.ok(service.createNewSoldier(data));
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Optional<Soldier>> deleteSoldierById(@RequestParam UUID soldierId){
        return ResponseEntity.ok(service.deleteSoldierById(soldierId));
    }


}
