package com.data.ss1btvn;

public class Work {
    String name;
    boolean status;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Work(String name, boolean status) {
        this.name = name;
        this.status = status;
    }
}