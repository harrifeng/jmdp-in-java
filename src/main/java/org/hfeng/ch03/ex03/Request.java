package org.hfeng.ch03.ex03;

public class Request {
    private final String name;

    public Request(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return " [ Request " + name + " ]";
    }
}
