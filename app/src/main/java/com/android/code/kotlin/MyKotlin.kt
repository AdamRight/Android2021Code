package com.android.code.kotlin

/**
 * Created by jiangtea on 2021/3/19.
 */
fun main() {
    int2Double(2)

    Util2.int2Double(3)

    Util3.int2Double(4)

    var user = User1()
    var myName = user.name ?: "kotlin"

    if (user.name?.length ?: 0 < 4){

    }


    var arrayListUser1 = ArrayList<User1>()
    var arrayListUser2: List<User1> = arrayListUser1.filter { it.name == "kotlin" }
}