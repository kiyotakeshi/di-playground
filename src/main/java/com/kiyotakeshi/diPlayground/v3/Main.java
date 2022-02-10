package com.kiyotakeshi.diPlayground.v3;

public class Main {

    public static void main(String[] args) {
        // Interface 型の変数(Engine) に実装したサブクラスのインスタンスを代入
        // Engine aEngine = new AEngine();
        Engine bEngine = new BEngine();

        // 依存(使用するエンジン)を変更する場合に Main のみ修正すればよい(Car の修正は不要)
        // 車クラスのテストをする際に、エンジンインターフェースを実装したダミークラスでテスト可能
        // interface を使って依存結合度を低くした状態を疎結合という
        // Car car = new Car(aEngine);
        Car car = new Car(bEngine);
        car.boot();
        car.stop();
    }
}
