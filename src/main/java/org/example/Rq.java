package org.example;

public class Rq {
    private String cmd;
    public Rq(String cmd) {
        this.cmd = cmd;
    }

    public String getActionName() {
        String[] stringQuery = cmd.split("\\?");
        return stringQuery[0];
    }
}
