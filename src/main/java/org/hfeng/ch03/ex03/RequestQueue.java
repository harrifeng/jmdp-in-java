package org.hfeng.ch03.ex03;

import java.util.LinkedList;

public class RequestQueue {
    private final LinkedList<Request> queue = new LinkedList<>();

    public synchronized Request getRequest() {
        while (queue.size() <= 0) {
            try {
                System.out.println(Thread.currentThread().getName() + ": wait() begins, queue = " + queue);
                wait();
                System.out.println(Thread.currentThread().getName() + ": wait() ends, queue = " + queue);
            } catch (InterruptedException e) {

            }
        }
        return queue.removeFirst();
    }

    public synchronized void putRequest(Request request) {
        queue.addLast(request);
        System.out.println(Thread.currentThread().getName() + ": notify() begins, queue = " + queue);
        notifyAll();
        System.out.println(Thread.currentThread().getName() + ": notify() ends, queue = " + queue);
    }

}
