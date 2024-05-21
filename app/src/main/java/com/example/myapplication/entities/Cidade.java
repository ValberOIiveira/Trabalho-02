package com.example.myapplication.entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Cidade {

    @PrimaryKey(autoGenerate = true)
    private int cidadeId;

    private String cidade;
    private String estado;

    public Cidade() {
    }

    public Cidade(String cidade, String estado) {
        this.cidade = cidade;
        this.estado = estado;
    }

    // Getters and Setters omitted for brevity

    // Implement getters and setters for all member variables (cidadeId, cidade, estado)

    @Override
    public String toString() {
        return "Cidade{" +
                "cidadeId=" + cidadeId +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}
