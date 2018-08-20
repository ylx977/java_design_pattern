package com.fuzamei.balk;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by fuzamei on 2018/8/20.
 */
public class Client {

    public static void main(String[] args) {
        final WashingMachine washingMachine = new WashingMachine();
        ExecutorService es = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 3; i++){
            es.execute(washingMachine::wash);
        }

//        es.shutdown();

        try {
            es.awaitTermination(10, TimeUnit.SECONDS);
        }catch (Exception e){
            System.out.println("wrong");
        }
    }

}
