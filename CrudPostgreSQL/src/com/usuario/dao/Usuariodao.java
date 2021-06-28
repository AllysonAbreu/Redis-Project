package com.usuario.dao;

import com.usuario.Usuario;
import org.postgresql.core.ConnectionFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Usuariodao {

    public void save(Usuario usuario){

        String sql = "INSERT INTO usuario(name,email)" + "VALUE(allyson,allyson.cz@hotmail.com)";

        Connection conn = null;
        PreparedStatement pstm = null;



    }

}
