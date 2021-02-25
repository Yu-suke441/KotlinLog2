package com.example.kotlinlog2

abstract class Animal {
    // プロパティ
    var name: String
    var age: Int

    // 引数つきのコンストラクタ
    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }

    abstract fun say()
    abstract fun think()
}