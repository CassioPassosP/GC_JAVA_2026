package com.example.demo.domain.entities;

import com.example.demo.domain.enums.DELEGATION_TYPE;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
public class Soldier {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;
    @EnumeratedValue
    private DELEGATION_TYPE type;

    public Soldier (String name, DELEGATION_TYPE type){
        this.name = name;
        this.type = type;
    }
}
