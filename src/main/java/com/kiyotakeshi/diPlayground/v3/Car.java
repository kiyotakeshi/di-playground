package com.kiyotakeshi.diPlayground.v3;

public class Car {

    // フィールドを interface に変更する
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void boot() {
        engine.boot();
    }

    public void stop() {
        engine.stop();
    }
}
