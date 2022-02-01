package com.company;

public class Phone {
    String name;
    String marka;
    String made;
    int jyly;
    String tusu;

    void phone(){
        System.out.println( name +" "+ marka + ""+ made );
    }
    String phone1(){
        String info = tusu + " " + jyly ;
        return info;
    }
}
