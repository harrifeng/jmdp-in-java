package org.hfeng.ch03;

import java.util.LinkedList;

public class RequestQueue {
    private final LinkedList<Request> queue = new LinkedList<>();

    public synchronized Request getRequest() {
        while (queue.size() <= 0) {
            try {
                wait();
            } catch (InterruptedException e) {

            }
        }
        return queue.removeFirst();
    }

    public synchronized void putRequest(Request request) {
        queue.addLast(request);
        notifyAll();
    }

}
