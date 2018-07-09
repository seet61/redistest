package ru.tele2.redistest;

import redis.clients.jedis.Jedis;

import java.util.List;

public class RedisListJava {
    public static void main(String[] args) {
        //Connecting to Redis server on localhost
        Jedis jedis = new Jedis("10.78.221.57");
        jedis.auth("rootpwd");
        System.out.println("Connection to server sucessfully");

        //store data in redis list
        jedis.lpush("tutorial-list", "Redis");
        jedis.lpush("tutorial-list", "Mongodb");
        jedis.lpush("tutorial-list", "Mysql");
        jedis.lpush("tutorial-list", "Postgre");
        jedis.lpush("tutorial-list", "Oracle");
        jedis.lpush("tutorial-list", "Ignite");
        System.out.println("tutorial-list size:: " + jedis.llen("tutorial-list"));
        // Get the stored data and print it
        List<String> list = jedis.lrange("tutorial-list", 0 ,jedis.llen("tutorial-list"));

        for(int i = 0; i<list.size(); i++) {
            System.out.println("Stored string in redis:: "+list.get(i));
        }
    }
}
