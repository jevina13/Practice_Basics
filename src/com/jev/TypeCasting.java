package com.jev;

public class TypeCasting {
    public static void main(String[] args) {
        //two types should be compatible
        //destination type should be greater than source type .... left side should be greater than the input
        //

        //Type Casting- compressing a bigger number to a smaller type explicitly
        int num = (int)(256.649f);
        System.out.println(num);

        //automatic type promotion in expression
        int a =257;
        byte x= (byte)(a);  //257 % 256 since 256 greatest val a byte can store

        System.out.println(x);


        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i=8000;
        float f = 52.6f;
        double d = 0.342341;
        double result = (f*b)+ (i/c)-(d*s);
        System.out.println((f*b)+"  "+(i/c)+"  "+(d*s));
        //here every result is converted to double as it is the biggest one
        System.out.println(result);


    }
}
