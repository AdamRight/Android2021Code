package com.android.code.kotlin;

/**
 * Created by jiangtea on 2021/3/19.
 */
class MyJave {
    public static void main(String[] args){
        Util1Kt.int2Double(4);

        Util2.INSTANCE.int2Double(5);

        Util3.Companion.int2Double(6);

        Util3.int2Double2(7);

        Util4.int2Double4(8);
    }
}
