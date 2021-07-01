package com.home.view;

import com.home.crud.App;
import com.home.dao.RascunhoDao;
import com.home.models.Rascunho;
import com.home.models.Usuario;
import redis.clients.jedis.Jedis;

import java.util.Random;

public class Main {
    public static void main(String[] args){
          App app = new App();
//        app.connect();

        Random r= new Random();
        int id = r.nextInt(100);
        Usuario user = new Usuario(id,"Allyson Oliveira", "allyson.cz@hotmail.com");
        int id1 = r.nextInt(100);
        Usuario user1 = new Usuario(id1,"Manuela Sousa", "manuela.cz@hotmail.com");
        int id2 = r.nextInt(100);
        Usuario user2 = new Usuario(id2,"Patrick Anderson", "patrick.cz@hotmail.com");

//        app.setUser(user);
//        System.out.print(
//                String.format("%s foi adicionado na tabela com o id de número %d. " +
//                        "O seu e-mail é: %s", user.getName(), user.getId(), user.getEmail()));
//
//        app.setUser(user1);
//        System.out.print(
//              String.format("%s foi adicionado na tabela com o id de número %d. " +
//                    "O seu e-mail é: %s", user1.getName(), user1.getId(), user1.getEmail()));
//
//        app.setUser(user2);
//        System.out.print(
//              String.format("%s foi adicionado na tabela com o id de número %d. " +
//                    "O seu e-mail é: %s", user2.getName(), user2.getId(), user2.getEmail()));
//
//        app.getUsers();
//        app.updateEmail(user.getId(), "alllyson.cz@gmail.com");
//        app.deleteUser(41);
//        app.getUsers();

//        Rascunho rascunho = new Rascunho();
//        rascunho.setUser(user);
//        rascunho.setTitle("Lorem ipsum");
//        rascunho.setText("Lorem Ipsum is simply dummy text of the printing and typesetting industry.");
//        String ras = rascunho.toString();
//       // System.out.println(ras);
//
//        Rascunho rascunho1 = new Rascunho();
//        rascunho1.setUser(user1);
//        rascunho1.setTitle("Why do we use it?");
//        rascunho1.setText("It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout.");
//        String ras1 = rascunho1.toString();
//       // System.out.println(ras1);
//
//        Rascunho rascunho2 = new Rascunho();
//        rascunho2.setUser(user2);
//        rascunho2.setTitle("Where do it comes from?");
//        rascunho2.setText("Contrary to popular belief, Lorem Ipsum is not simply random text.");
//        String ras2 = rascunho2.toString();
//        //System.out.println(ras2);
//
//        RascunhoDao rascunhoDao = new RascunhoDao();
////        rascunhoDao.salvarRascunho(rascunho);
////        RascunhoDao rascunhoDao1 = new RascunhoDao();
////        rascunhoDao1.salvarRascunho(rascunho1);
////        RascunhoDao rascunhoDao2 = new RascunhoDao();
////        rascunhoDao2.salvarRascunho(rascunho2);
//        System.out.println(rascunhoDao.buscarRascunho(65));
//        System.out.println(rascunhoDao.buscarRascunho(37));
//        System.out.println(rascunhoDao.buscarRascunho(41));

    }
}
