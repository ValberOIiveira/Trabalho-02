package com.example.myapplication.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.myapplication.entities.Endereco;

import java.util.List;

@Dao
public interface EnderecoDao {

    @Insert
    void inserirEndereco(Endereco endereco);

    @Update
    void atualizarEndereco(Endereco endereco);

    @Delete
    void excluirEndereco(Endereco endereco);

    @Query("SELECT * FROM Endereco")
    List<Endereco> obterTodosEnderecos();

    @Query("SELECT * FROM Endereco WHERE cidadeId = :cidadeId")
    List<Endereco> obterEnderecosPorCidade(int cidadeId);
}