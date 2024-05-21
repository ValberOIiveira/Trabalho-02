package com.example.myapplication.dao;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.myapplication.entities.Cidade;

import java.util.List;

@Dao
public interface CidadeDao {

    @Insert
    void inserirCidade(Cidade cidade);

    @Update
    void atualizarCidade(Cidade cidade);

    @Delete
    void excluirCidade(Cidade cidade);

    @Query("SELECT * FROM Cidade")
    List<Cidade> obterTodasCidades();
}