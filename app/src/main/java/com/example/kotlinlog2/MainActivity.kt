package com.example.kotlinlog2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human = Human("智", 27,"プログラミング")

        human.say()
        human.think()

//        dog.say()   // ポチが吠えます
//        Log.d("kotlintest", "犬の名前は" + dog.name + "です。")
//        Log.d("kotlintest", "犬の年齢は" + dog.age + "歳です。")
//
//        val bigdog = BigDog("ヨーゼフ", 15) // 名前をハチ、年齢10歳でDogのインスタンスを取得
//        bigdog.say()  //ハチが吠えます
//        Log.d("kotlintest", "犬の名前は" + bigdog.name + "です。")
//        Log.d("kotlintest","犬の年齢は" + bigdog.age + "歳です。")



    }

}