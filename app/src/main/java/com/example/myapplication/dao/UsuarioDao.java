package com.example.myapplication.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.myapplication.entities.Usuario;

import java.util.List;


@Dao
public interface UsuarioDao {

    @Insert
    void insertUsuario(Usuario usuario);

    @Update
    void updateUsuario(Usuario usuario);

    @Delete
    void deleteUsuario(Usuario usuario);

    @Query("SELECT * FROM Usuario")
    List<Usuario> obterTodosUsuarios();

    @Query("SELECT * FROM Usuario WHERE email = :email AND senha = :senha")
    Usuario fazerLogin(String email, String senha);
}
