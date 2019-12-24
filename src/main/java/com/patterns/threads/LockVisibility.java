package com.patterns.threads;


import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
@Slf4j
public class LockVisibility {
    int a = 0, b = 0, c = 0;
Lock lock = new ReentrantLock();
    static Logger logger = LoggerFactory.getLogger(LockVisibility.class);

    private int volInt;
    public void writerThread(int id )
    {
        lock.lock();
        logger.info("Thread locked" +id );
        a += 1;
        b += 1;
        c += 1;
        volInt += 1;
        logger.info("Thread unlocked ");
        logger.info(String.valueOf(a));
        logger.info(String.valueOf(b));
        logger.info(String.valueOf(c));
        logger.info(String.valueOf(volInt));


        lock.unlock();
    }
    public static void main(String[] args) {
        int i = 10;

        LockVisibility lockVisibility = new LockVisibility();
        while (i--!=0)
        {
            int finalI = i;
            new Thread(()->{
                logger.info("Thread start");
                lockVisibility.writerThread(finalI);
                logger.info("Thread ended");
            }).start();
        }

    }
}
