package br.edu.ifpb.tsi.pdist.cinema.service;

import org.springframework.stereotype.Service;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

@Service
public class HelloWorldService {
   private static JedisPool connection = new JedisPool("redis", 6379); 

   public HelloWorldService() {

   }

   public String getMensagem(String key) {
       try (Jedis jedis = connection.getResource()) {
            return jedis.get(key);   
        }

   }

   public void criar(String key, String mensagem) {
        try (Jedis jedis = connection.getResource()) {
            jedis.append(key, mensagem);
        }       
   }
}
