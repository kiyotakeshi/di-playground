package com.kiyotakeshi.diPlayground.v2;

public class BEngine implements Engine{
    @Override
    public void boot() {
        System.out.println("BEngine boot");
    }

    @Override
    public void stop() {
        System.out.println("BEngine stop");
    }
}
