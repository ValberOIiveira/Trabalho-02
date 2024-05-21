package com.example.myapplication.database;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.myapplication.dao.CidadeDao;
import com.example.myapplication.dao.EnderecoDao;
import com.example.myapplication.dao.UsuarioDao;
import com.example.myapplication.entities.Cidade;
import com.example.myapplication.entities.Endereco;
import com.example.myapplication.entities.Usuario;

@Database(entities = {Usuario.class, Cidade.class, Endereco.class}, version = 1)
public abstract class ControleDeEnderecosDatabase extends RoomDatabase {

    private static ControleDeEnderecosDatabase INSTANCE;

    public static ControleDeEnderecosDatabase getDatabase(Context context) {
        if (INSTANCE == null) {
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            ControleDeEnderecosDatabase.class, "controle_enderecos")
                    .allowMainThreadQueries().build();
        }
        return INSTANCE;
    }

    public abstract UsuarioDao usuarioDao();

    public abstract CidadeDao cidadeDao();

    public abstract EnderecoDao enderecoDao();

    // Omit any unnecessary DAOs (like AlunoCursoDao in the example)
}
