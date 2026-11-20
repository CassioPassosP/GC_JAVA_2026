package com.example.demo.repositories;

import com.example.demo.domain.entities.Soldier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface SoldierRepository extends JpaRepository<Soldier, UUID>, CrudRepository <Soldier, UUID> {

}
