package com.patterns.threads;

public class SynchronizedFieldsVisibility {
    int a = 4, b = 0, c = 0;
    volatile  int volInt = 0;

    public void writerThread()
    {
        a = 1;
        b = 1;
        c = 1;
        synchronized (this)
        {
            volInt = 1;
        }
    }
    public static void main(String[] args) {

    }
}
