package org.example.module_7.interthread_communication.assignment;

public class order {
    private boolean foodReady = false;


    public synchronized void waitForOrder() {
        // call wait() function
    }

    public synchronized void prepareOrder() {
        // call notify() function
    }
}
