package com.home.dao;

import com.google.gson.Gson;
import com.home.models.Rascunho;
import redis.clients.jedis.Jedis;

public class RascunhoDao {
    
    private Jedis jedis;
    private Gson gson;

    public RascunhoDao() {
        jedis = new Jedis();
        gson = new Gson();
    }

    public boolean salvarRascunho(Rascunho rascunho){

        String id = String.valueOf(rascunho.getUser().getId());

        if(jedis.setex(id, 7200l, gson.toJson(rascunho))
        .equals("OK")) return true;
        return false;
    }
    public Rascunho buscarRascunho(int id){
        String parseId = String.valueOf(id);
        String json = jedis.get(parseId);

        if(json == null) {
            return null;
        } else {
            return gson.fromJson(json, Rascunho.class);
        }
    }
}
