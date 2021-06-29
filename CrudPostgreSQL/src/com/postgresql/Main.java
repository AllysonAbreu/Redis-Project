package com.postgresql;

import com.usuario.Usuario;

import java.util.Random;

public class Main {
    public static void main(String[] args){
        App app = new App();
        //app.connect();

        Random r= new Random();
        int id = r.nextInt(100);
        Usuario user1 = new Usuario(id,"Juliana Sousa", "juliana.cz@hotmail.com");
        //Usuario user2 = new Usuario(id,"Patrick Anderson", "patrick.cz@hotmail.com");

        //app.setUser(user1);
        //System.out.print(
        //      String.format("%s foi adicionado na tabela com o id de número %d. " +
        //            "O seu e-mail é: %s", user1.getName(), user1.getId(), user1.getEmail()));

        //app.setUser(user2);
        //System.out.print(
        //      String.format("%s foi adicionado na tabela com o id de número %d. " +
        //            "O seu e-mail é: %s", user2.getName(), user2.getId(), user2.getEmail()));

        app.getUsers();
        //app.updateEmail(74,"alllyson.cz@gmail.com");
        //app.deleteUser(47);


    }
}
