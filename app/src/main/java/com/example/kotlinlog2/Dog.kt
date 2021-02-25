package com.example.kotlinlog2

import  android.util.Log

internal abstract class Dog: Animal, Movable {
    // コンストラクタ
    constructor(name: String, age: Int): super(name,age) {

    }

    // Animalクラスのメソッドをオーバーライド
    override fun say() {
        Log.d("kotlintest",this.name + "(" + this.age + "歳)" + "「ワンワン」")
    }

    // Movableインターフェイスのメソッドをオーバーライド
    override  fun move() {
        Log.d("kotlintest", this.name + "(" + this.age + "歳)" + "は全力で走った。")
    }


}