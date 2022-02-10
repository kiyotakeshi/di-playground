package com.kiyotakeshi.diPlayground.v1;

public class Main {

    public static void main(String[] args) {
        // 車クラスはエンジンに依存 = 車の性能はエンジンに依存
        // あるクラスが別のクラスを利用するのが依存
        AEngine aEngine = new AEngine();
        Car car = new Car(aEngine);

        // エンジンを交換する際に Car と Main どちらも修正が必要
        // テストしづらく変更に弱い、密結合な状態
        // BEngine bEngine = new BEngine();
        // Car car = new Car(bEngine);

    }
}
