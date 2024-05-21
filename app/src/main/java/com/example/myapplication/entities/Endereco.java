package com.example.myapplication.entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Endereco {

    @PrimaryKey(autoGenerate = true)
    private int enderecoId;

    private String descricao;
    private double latitude;
    private double longitude;
    private int cidadeId;

    public Endereco() {
    }

    public Endereco(String descricao, double latitude, double longitude, int cidadeId) {
        this.descricao = descricao;
        this.latitude = latitude;
        this.longitude = longitude;
        this.cidadeId = cidadeId;
    }

    // Getters and Setters omitted for brevity

    // Implement getters and setters for all member variables (enderecoId, descricao, latitude, longitude, cidadeId)

    @Override
    public String toString() {
        return "Endereco{" +
                "enderecoId=" + enderecoId +
                ", descricao='" + descricao + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", cidadeId=" + cidadeId +
                '}';
    }
}