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

    public String getParam(String key) {
        String[] stringQuery = cmd.split("[?&=]");
        for (int i = 0; i < stringQuery.length; i++) {
            if (stringQuery[i].equals(key)) {
                return stringQuery[i+1];
            }
        }

        return "찾을 수 없음";
    }
}
