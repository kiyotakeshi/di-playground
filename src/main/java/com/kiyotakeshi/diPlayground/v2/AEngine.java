package com.kiyotakeshi.diPlayground.v2;

public class AEngine implements Engine{

    public AEngine() {
    }

    @Override
    public void boot() {
        System.out.println("AEngine boot");
    }

    @Override
    public void stop() {
        System.out.println("AEngine stop");
    }
}
