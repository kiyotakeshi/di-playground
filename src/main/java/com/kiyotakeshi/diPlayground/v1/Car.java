package com.kiyotakeshi.diPlayground.v1;

public class Car {
    // 依存は他のクラスを利用しているか
    // 他のクラスをローカル変数として持っている
    // 他のクラスがメソッドの引数、戻り値になっている
    private AEngine aEngine;

    // エンジンを交換する際に Car と Main どちらも修正が必要
    // テストしづらく変更に弱い、密結合な状態
    // private BEngine bEngine;

    public Car(AEngine aEngine) {
        this.aEngine = aEngine;
    }

//    public Car(BEngine bEngine) {
//        this.bEngine = bEngine;
//    }
}
