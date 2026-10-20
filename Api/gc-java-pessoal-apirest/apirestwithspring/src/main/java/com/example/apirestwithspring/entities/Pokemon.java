package com.example.apirestwithspring.entities;

import lombok.Getter;
import lombok.Setter;

public record Pokemon(Integer id, String name, double height ) {

    @Override
    public String toString() {
        return "com.example.apirestwithspring.entities.Pokemon: " +
                "id=" + id +
                ", name='" + name + '\'' +
                ", height=" + height +
                '}';
    }
}
