package ru.tele2.redistest;

import redis.clients.jedis.Jedis;

public class RedisStringJava {
    public static void main(String[] args) {
        //Connecting to Redis server on localhost
        Jedis jedis = new Jedis("10.78.221.57");
        jedis.auth("rootpwd");
        System.out.println("Connection to server sucessfully");
        //set the data in redis string
        jedis.set("tutorial-name", "Redis tutorial");
        // Get the stored data and print it
        System.out.println("Stored string in redis:: "+ jedis.get("tutorial-name"));
    }
}
